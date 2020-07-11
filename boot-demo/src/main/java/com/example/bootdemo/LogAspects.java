package com.example.bootdemo;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspects {
    /**
     * 定义切入点，切入点为com.example.demo.aop.AopController中的所有函数
     *通过@Pointcut注解声明频繁使用的切点表达式
     */
//    @Pointcut("execution(public * *.*(..)))")
    @Pointcut("execution(public * com.example.bootdemo.Test.*(..)))")
    public void BrokerAspect(){

    }
    //拦截div方法之前
    @Before("BrokerAspect()")
    public void logStart(){
        System.out.println("开始运行了....参数列表时");
    }

    //拦截div方法之后
    @After("BrokerAspect()")
    public void logEnd(){
        System.out.println("运行结束了");
    }

    //拦截div方法正常返回返回值
    @AfterReturning(value = "BrokerAspect()",returning="result")
    public void logReturn(Object result){
        System.out.println("运行返回正常。。。运行结果是："+result);
    }

//    拦截div方法正常返回返回值
    @AfterThrowing(value = "BrokerAspect()",throwing="exception")
    public void logException(Exception exception){
        System.out.println("运行出现异常。。。异常是："+exception);
    }
}
