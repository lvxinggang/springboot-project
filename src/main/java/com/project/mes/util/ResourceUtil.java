package com.project.mes.util;

import com.project.mes.systemmanage.dao.SysMenuMapper;
import com.project.mes.systemmanage.bean.SysMenu;

import java.util.List;

public class ResourceUtil {
    public static void getParentResource(List<SysMenu> sysMenuList, SysMenuMapper sysMenuMapper){
        for (SysMenu sysMenus : sysMenuList) {
            // 封装资源
            selectSonResource(sysMenus,sysMenuMapper);
        }
    }

    /**
     * 不确定节点资源封装
     * @param sysMenuMapper
     */
    public static void selectSonResource(SysMenu sysMenu, SysMenuMapper sysMenuMapper){
        // 根据父节点查询子节点
        List<SysMenu> sonList = sysMenuMapper.findByParentnodeid(sysMenu.getMenuid());
        // 判断子资源是否存在，如果存在，继续查询子子资源
        if(sonList.size()>0 || null !=sonList){
            // 将子资源 放入父级集合属性中
            sysMenu.setChildMenus(sonList);
            for (SysMenu menu : sonList) {
                selectSonResource(menu,sysMenuMapper);
            }
        }
    }
}
