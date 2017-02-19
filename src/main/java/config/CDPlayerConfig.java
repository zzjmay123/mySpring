package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sounds.BlackCD;
import sounds.CDPlayer;
import sounds.CompactDisc;
import sounds.GreenCD;

/**
 * 基于java代码的装配
 * Created by zhouzhenjiang on 2017/2/2.
 */
@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc blackCD(){
        return  new GreenCD();
    }

    @Bean
    public CompactDisc greenCD(){
        return  new GreenCD();
    }

    @Bean
    public CDPlayer cdPlayer(){
        return  new CDPlayer();
    }


}
