package com.project.mes.systemmanage.controller;

import com.project.mes.result.Result;
import com.project.mes.systemmanage.bean.SysPosition;
import com.project.mes.systemmanage.service.PositionService;
import com.project.mes.util.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
 * @Package: com.project.mes.systemmanage
 * @ClassName: PositionController
 * @Author: zhubingan
 * @Description: 岗位管理控制层
 * @Date: 2020/1/9 10:56
 * @Version: 1.0
 */
@RestController
@RequestMapping("/position")
public class PositionController {
    @Autowired
    private PositionService positionService;

    /**
     * 查询全部岗位信息
     * @param map
     * @return
     */
    @GetMapping("/selectposition")
    public Result<Object> selectPosition(@RequestParam Map<String, Object> map
    ) {
        PageVo<SysPosition> positionPageVo = positionService.selectPosition(map);
        return new Result<>(true, 200, "查询成功", positionPageVo);
    }

    /**
     * 新增岗位
     * @param params
     * @return
     */
    @PostMapping("/insertposition")
    public Result insertPosition(@RequestBody String params) {
        boolean flag = this.positionService.insertPosition(params);
        if (flag) {
            return new Result(true, 200, "添加成功", null);
        }
        return new Result(true, 201, "添加失败", null);
    }

    /**
     * 修改岗位
     * @param params
     * @return
     */
    @PostMapping("/updateposition")
    public Result updatePosition(@RequestBody String params) {
        boolean flag = this.positionService.updatePosition(params);
        if (flag) {
            return new Result(true, 200, "编辑成功", null);
        }
        return new Result(false,201,"编辑失败",null);
    }

    /**
     * 删除摄像机信息
     * @param params
     * @return
     */
    @PostMapping("/deleteposition")
    public Result deletePosition(@RequestBody String params) {
        boolean flag = this.positionService.deletePosition(params);
        if (flag) {
            return new Result(true, 200, "删除成功", null);
        }
        return new Result(false,201,"删除失败",null);
    }
}
