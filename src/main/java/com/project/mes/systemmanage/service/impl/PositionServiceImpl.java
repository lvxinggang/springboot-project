package com.project.mes.systemmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.project.mes.systemmanage.bean.SysPosition;
import com.project.mes.systemmanage.dao.SysPositionMapper;
import com.project.mes.systemmanage.service.PositionService;
import com.project.mes.util.PageVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Package: com.project.mes.systemmanage.service.impl
 * @ClassName: PositionServiceImpl
 * @Author: zhubingan
 * @Description:
 * @Date: 2020/1/9 11:18
 * @Version: 1.0
 */
@Service
public class PositionServiceImpl implements PositionService {

    @Resource
    private SysPositionMapper sysPositionMapper;

    /**
     * 查询全部岗位信息
     *
     * @param map
     * @return
     */
    @Override
    public PageVo<SysPosition> selectPosition(Map<String, Object> map) {
        JSONObject jsonObject = new JSONObject(map);
        Integer currentPage = jsonObject.getInteger("currentPag");
        Integer pageSize = jsonObject.getInteger("pageSize");
        String name = jsonObject.getString("name");
        SysPosition sysPosition = new SysPosition();
        sysPosition.setPostname(name);
        int cameraeNum;
        if (pageSize <= 0) {
            cameraeNum = pageSize;
        } else {
            cameraeNum = sysPositionMapper.countPosition(sysPosition);
        }
        PageVo<SysPosition> pageVo = new PageVo<>(currentPage, pageSize, cameraeNum);
        pageVo.setTotalNum(cameraeNum);
        pageVo.setItems(sysPositionMapper.selectPosition(sysPosition, pageVo.getStartIndex(), pageSize));
        return pageVo;
    }

    /**
     * 添加岗位
     *
     * @param params
     * @return
     */
    @Override
    @Transactional
    public boolean insertPosition(String params) {
        if (params == null)
            return false;
        JSONObject jsonObject = JSONObject.parseObject(params);
        SysPosition sysPosition = new SysPosition();
        sysPosition.setPostname(jsonObject.getString("postname"));
        //这里从session里面调取当前人信息
        int insert = sysPositionMapper.insert(sysPosition);
        if (insert != 0) {
            //这里添加中间表
            return true;
        }
        return false;
    }

    /**
     * 修改岗位
     *
     * @param params
     * @return
     */
    @Override
    public boolean updatePosition(String params) {
        if (params == null)
            return false;
        JSONObject jsonObject = JSONObject.parseObject(params);
        SysPosition sysPosition = new SysPosition();
        sysPosition.setPostname(jsonObject.getString("postname"));
        sysPosition.setPostid(jsonObject.getLong("postId"));
        int i = sysPositionMapper.updateByPrimaryKey(sysPosition);
        if (i != 0) {
            //这里进行删除中间表，重新建立关联关系。
            return true;
        }
        return false;
    }

    @Override
    public boolean deletePosition(String params) {
        if (params == null)
            return false;
        JSONObject jsonObject = JSONObject.parseObject(params);
        //这里判断是否关联了角色
        int i = sysPositionMapper.deleteByPrimaryKey(jsonObject.getLong("postId"));
        if (i < 0)
            return true;
        return false;
    }
}
