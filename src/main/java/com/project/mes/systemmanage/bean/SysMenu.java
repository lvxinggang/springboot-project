package com.project.mes.systemmanage.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class SysMenu implements Serializable {
    /**
     * 菜单ID
     */
    private String menuid;

    /**
     * 菜单名
     */
    private String menuname;

    /**
     * 上级节点ID
     */
    private String parentnodeid;

    /**
     * 排序01/02/03
     */
    private String seqno;

    /**
     * 页面链接
     */
    private String pageurl;

    /**
     * 图标链接
     */
    private String iconurl;

    /**
     * 是否显示0不显示1显示
     */
    private String isvisible;

    /**
     * 备注
     */
    private String remark;
    private List<SysMenu> childMenus;

    @Override
    public String toString() {
        return "SysMenu{" +
                "menuid='" + menuid + '\'' +
                ", menuname='" + menuname + '\'' +
                ", parentnodeid='" + parentnodeid + '\'' +
                ", seqno='" + seqno + '\'' +
                ", pageurl='" + pageurl + '\'' +
                ", iconurl='" + iconurl + '\'' +
                ", isvisible='" + isvisible + '\'' +
                ", remark='" + remark + '\'' +
                ", childMenus=" + childMenus +
                '}';
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getParentnodeid() {
        return parentnodeid;
    }

    public void setParentnodeid(String parentnodeid) {
        this.parentnodeid = parentnodeid;
    }

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public String getPageurl() {
        return pageurl;
    }

    public void setPageurl(String pageurl) {
        this.pageurl = pageurl;
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }

    public String getIsvisible() {
        return isvisible;
    }

    public void setIsvisible(String isvisible) {
        this.isvisible = isvisible;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<SysMenu> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<SysMenu> childMenus) {
        this.childMenus = childMenus;
    }

    public SysMenu() {
    }

    public SysMenu(String menuid, String menuname, String parentnodeid, String seqno, String pageurl, String iconurl, String isvisible, String remark, List<SysMenu> childMenus) {
        this.menuid = menuid;
        this.menuname = menuname;
        this.parentnodeid = parentnodeid;
        this.seqno = seqno;
        this.pageurl = pageurl;
        this.iconurl = iconurl;
        this.isvisible = isvisible;
        this.remark = remark;
        this.childMenus = childMenus;
    }

    public SysMenu(String menuid, String menuname, String parentnodeid) {
        this.menuid = menuid;
        this.menuname = menuname;
        this.parentnodeid = parentnodeid;
    }
}
