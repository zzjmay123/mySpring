package soundTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import config.CDPlayerConfig;
import sounds.CDPlayer;
import sounds.CompactDisc;

import javax.annotation.Resource;

/**
 *
 * 测试类
 * Created by zhouzhenjiang on 2017/2/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = CDPlayerConfig.class)
@ContextConfiguration("classpath:spring-config.xml")
public class CDPlayerTest {

    @Resource
    private CompactDisc blackCD;


    @Test
    public void testCD(){
        Assert.notNull(blackCD);
        blackCD.play();
    }
}
