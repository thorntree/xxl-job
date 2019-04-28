package com.xxl.job.admin.core.model;


/**
 * @Author: liuxiaoshuai
 * @Date: 2019/4/19
 * @Description: 任务服务注入到
 */
public class XxlJobInject{
    private Integer id;
    //执行器id
    private Integer groupId;
    //添加服务类型
    private Integer type;
    //添加服务参数
    private String jobService;
    //JobHandler name
    private String jobhandlerName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getJobService() {
        return jobService;
    }

    public void setJobService(String jobService) {
        this.jobService = jobService;
    }

    public String getJobhandlerName() {
        return jobhandlerName;
    }

    public void setJobhandlerName(String jobhandlerName) {
        this.jobhandlerName = jobhandlerName;
    }

    @Override
    public String toString() {
        return "XxlJobInject{" +
                "id=" + id +
                ", groupId=" + groupId +
                ", type=" + type +
                ", jobService='" + jobService + '\'' +
                ", jobhandlerName='" + jobhandlerName + '\'' +
                '}';
    }
}
