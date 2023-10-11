package com.emiyez.springboot01.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;


@Data
public class Menu implements Serializable {

    private int id;
    private int pid;//父级id
    private String title;
    private String icon;
    private String href;
    private String target;

    private Integer sort;
    private Integer status;

    private List<Menu> child = new LinkedList<>();

    public Menu() {
    }

    public Menu(String title, String href) {
        this.title = title;
        this.href = href;
    }

    public Menu(int id, String title, String icon, String href, String target, int pid, Integer sort, Integer status, List<Menu> child) {
        this.id = id;
        this.title = title;
        this.icon = icon;
        this.href = href;
        this.target = target;
        this.pid = pid;
        this.sort = sort;
        this.status = status;
        this.child = child;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer weight) {
        this.sort = weight;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Menu> getChild() {
        return child;
    }

    public void setChild(List<Menu> child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", href='" + href + '\'' +
                ", target='" + target + '\'' +
                ", pid=" + pid +
                ", sort=" + sort +
                ", status=" + status +
                ", child=" + child +
                '}';
    }
}
