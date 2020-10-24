package cn.lsy99.spring.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProcessTimeAspect {

    Logger logger = LoggerFactory.getLogger(getClass());

//    @Before("execution(* cn.lsy99.spring.demo01.controller.TestController.hello(String))")
//    public void pc1(){
//        System.out.println("begin");
//    }
//     @Around("@annotation(cn.lsy99.spring.demo01.annotation.ProcessTime)")

    @Pointcut("execution(* cn.lsy99.spring.demo.controller.DemoController.*(..))")
    public void pc1() {
    }

    @Pointcut("@annotation(cn.lsy99.spring.demo.annotation.ProcessTime)")
    public void pc2() {
    }

    @Around("pc1()")
    public Object recordTime(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object o = pjp.proceed();
        long end = System.currentTimeMillis();
        logger.info("process time: {}ms", end - start);
        return o;
    }

}
