package com.project.mes.systemmanage.service;

import com.project.mes.systemmanage.bean.SysPosition;
import com.project.mes.util.PageVo;

import java.util.Map;

/**
 * @Package: com.project.mes.systemmanage
 * @ClassName: PositionService
 * @Author: zhubingan
 * @Description: 岗位管理实现层
 * @Date: 2020/1/9 11:17
 * @Version: 1.0
 */
public interface PositionService {

    PageVo<SysPosition> selectPosition(Map<String, Object> map);

    boolean insertPosition(String params);

    boolean updatePosition(String params);

    boolean deletePosition(String params);
}
