package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by zhouzhenjiang on 2017/2/19.
 */
@Component
@Aspect
public class Audience {

    @Pointcut("execution(* aop.impl.Singer.play())")
    public void test(){}

    @Before("test()")
    public void beforePlay(){
        System.out.println("表演开始前进行.....");
    }

    @After("test()")
    public void afterPlay(){
        System.out.println("表演开始前进行.....");
    }
}
