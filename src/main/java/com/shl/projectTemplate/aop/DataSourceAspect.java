package com.shl.projectTemplate.aop;

import com.shl.projectTemplate.annotation.ReadDataSource;
import com.shl.projectTemplate.datasource.DataSourceContextHolder;
import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 数据源切换
 * @author songhengliang
 * @date 2019/2/24
 */
@Component
@Aspect
public class DataSourceAspect {
//
//    // 日志
//    private static final Logger log = LogManager.getLogger(DataSourceAspect.class);
//
//
//    /**
//     * 配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
//     */
//    @Pointcut("execution(* com.shl.projectTemplate.service.*.*(..))")
//    private void aspect() {
//    }
//
//    /**
//     * 配置前置通知,使用在方法aspect()上注册的切入点
//     * 同时接受JoinPoint切入点对象,可以没有该参数
//     */
//    @Before("aspect()")
//    public void before(JoinPoint joinPoint) {
//        Object target = joinPoint.getTarget();
//        String methodName = joinPoint.getSignature().getName();
//
//        Class<?>[] parameterTypes = ((MethodSignature) joinPoint.getSignature())
//                .getMethod().getParameterTypes();
//        try {
//            Method method = target.getClass().getMethod(methodName, parameterTypes);
//            if (method != null && method.isAnnotationPresent(ReadDataSource.class)) {
//                // 读库
//                DataSourceContextHolder.read();
//            }
//
//        } catch (Throwable e) {
//            log.info("AOP: 数据源切换异常. ");
//            e.printStackTrace();
//        }
//
//    }
//
//    //配置后置通知,使用在方法aspect()上注册的切入点
//    @After("aspect()")
//    public void after(JoinPoint joinPoint) {
//        // 清理
//        DataSourceContextHolder.clearDataSourceType();
//
//    }

}
