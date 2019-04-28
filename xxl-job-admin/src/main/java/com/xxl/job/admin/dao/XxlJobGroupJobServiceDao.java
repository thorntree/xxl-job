package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.XxlJobInject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface XxlJobGroupJobServiceDao {
    /**
     * 根据条件查询任务服务
     * @param xxlJobInject
     * @return
     */
    public List<XxlJobInject> getJobInjectByJobHandlerName(XxlJobInject xxlJobInject);

    /**
     * 添加服务注册
     * @param xxlJobInject
     * @return
     */
    public int save(XxlJobInject xxlJobInject);

    /**
     * 删除服务注册
     * @param id
     * @return
     */
    public int remove(Integer id);

    /**
     * 修改服务注册
     * @param xxlJobInject
     * @return
     */
    public int update(XxlJobInject xxlJobInject);

}
