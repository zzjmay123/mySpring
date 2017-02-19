package sounds;

import org.springframework.stereotype.Component;

/**
 * Created by zhouzhenjiang on 2017/2/2.
 */
@Component
public class GreenCD implements CompactDisc{


    @Override
    public void play() {
        System.out.println("this is green CD");
    }
}
