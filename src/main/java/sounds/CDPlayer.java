package sounds;

import javax.annotation.Resource;

/**
 * Created by zhouzhenjiang on 2017/2/2.
 */
public class CDPlayer {

    @Resource
    private CompactDisc blackCD;

    public void playCD(){
        blackCD.play();
    }
}
