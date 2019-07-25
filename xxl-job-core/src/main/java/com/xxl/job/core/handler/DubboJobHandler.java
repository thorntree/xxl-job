package com.xxl.job.core.handler;

/**
 * @Author: liuxiaoshuai
 * @Date: 2019/4/25
 * @Description:
 */
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.log.XxlJobLogger;

import java.io.Serializable;
import java.lang.reflect.Method;


public class DubboJobHandler extends IJobHandler implements Serializable {

    private static final long serialVersionUID = -479630627743999152L;

    @Override
    public ReturnT<String> execute(String param){
        XxlJobLogger.log("XXL-JOB, FirstJobHandler start.param{}",param);
        Object invoke=null;
        String paramStr = param.trim();
        if(null!=paramStr && paramStr.trim().length()>0){
            int lastIndex = paramStr.lastIndexOf("#");
            String className = paramStr.substring(0, lastIndex);
            String methodName= paramStr.substring(lastIndex+1);
            try {
                //反射获取对应的类
                Class<?> cls=Class.forName(className);
                //初始化一个实例
                Object o = cls.newInstance();
                Method method = cls.getMethod(methodName);
                invoke = method.invoke(o);
                if(null==invoke){
                    XxlJobLogger.log("dubboDemoJobHandler fail: {}", DubboJobHandler.FAIL);
                    return ReturnT.FAIL;
                }
            }catch (Exception e){
                XxlJobLogger.log("dubboDemoJobHandler fail: {}",e);
                return ReturnT.FAIL;
            }

        }
        XxlJobLogger.log("XXL-JOB, FirstJobHandler end:{}",invoke);
        return ReturnT.SUCCESS;
    }
}
