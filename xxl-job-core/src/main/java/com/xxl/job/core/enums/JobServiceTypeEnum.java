package com.xxl.job.core.enums;

public enum JobServiceTypeEnum {
    DUBBO_SERVICE(0,"com.xxl.job.core.handler.DubboJobHandler"),
    HTTP_SERVICE(1,"com.xxl.job.core.handler.HttpJobHandler");
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
    public static String getDesc(Integer type){
        if(1==type){
            return HTTP_SERVICE.getDesc();
        }else{
            return DUBBO_SERVICE.getDesc();
        }
    }
}
