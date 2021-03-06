package com.tuling;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by smlz on 2019/6/10.
 */
//@Aspect
//@Component
public class TimeCountAspect {

    @Pointcut("execution(* com.tuling.*.*(..))")
    public void pointCut(){}

    @Before(value = "pointCut()")
    public void methodBefore(JoinPoint joinPoint){

        String methodName = joinPoint.getSignature().getName();
        System.out.println("time count 执行目标方法 【"+methodName+"】之前执行<前置通知>,入参"+ Arrays.asList(joinPoint.getArgs()));
    }

    @After(value = "pointCut()")
    public void methodAfter(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("time count 执行目标方法 【"+methodName+"】之前执行<后置通知>,入参"+Arrays.asList(joinPoint.getArgs()));
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void methodReturning(JoinPoint joinPoint,Object result) {
        System.out.println(result);
        String methodName = joinPoint.getSignature().getName();
        System.out.println("time count 执行目标方法 【"+methodName+"】之前执行<返回通知>,入参"+Arrays.asList(joinPoint.getArgs()));
    }

    @AfterThrowing(value = "pointCut()")
    public void methodAfterThrowing(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();

        System.out.println("time count 执行目标方法 【"+methodName+"】之前执行<异常通知>,入参"+Arrays.asList(joinPoint.getArgs()));
    }

    @Around(value = "pointCut()")
    public Object methodAfterThrowing(ProceedingJoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        long start = System.currentTimeMillis();
        System.out.println("time count 执行目标方法 【"+methodName+"】之前执行<环绕通知>,start"+start);
        //调用目标方法
        Object object = null;
        try  {
            object = joinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println("调用目标方法异常:"+throwable.getMessage());
            throwable.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("time count 执行目标方法 【"+methodName+"】之前执行<环绕通知>,end:"+end+",总用时："+(end-start));
        return object;
    }
}
