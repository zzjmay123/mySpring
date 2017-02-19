package aopTest;

import aop.Performance;
import aop.impl.Singer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zhouzhenjiang on 2017/2/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class TestAop {

    @Resource(name = "singer")
    private Performance singer;

    @Test
    public void playTest(){
        singer.play();
    }
}
