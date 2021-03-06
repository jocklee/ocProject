package com.online.college.core.menu.domain;

import com.online.college.common.orm.BaseEntity;

/**
 * @ClassName Menu
 * @Description TODO
 * @Author like
 * @Data 2019/3/6 13:51
 * @Version 1.0
 **/

public class Menu extends BaseEntity {

    private Long id;
    private String menuName;
    private String url;
    private String clazzName;
    private Integer isShow;
    private Integer type;
    private String target;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }


    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
