package com.xxl.job.core.enums;

public enum JobServiceTypeEnum {
    DUBBO_SERVICE(0,"dubbo"),
    HTTP_SERVICE(1,"http");
    private Integer num;
    private String desc;

    JobServiceTypeEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
