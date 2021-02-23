package com.sms.bean;

public class Skill extends BaseBean {

    private String name;
    private Integer level;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Skill{" +
                "id='" + getId() + '\'' +
                "createdTime='" + getCreatedTime() + '\'' +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}


