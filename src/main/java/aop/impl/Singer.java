package aop.impl;

import aop.Performance;
import org.springframework.stereotype.Component;

/**
 * Created by zhouzhenjiang on 2017/2/19.
 */
@Component("singer")
public class Singer implements Performance {


    @Override
    public void play() {

        System.out.println("我是歌手薛之谦  接下来要唱的是演员");

    }
}
