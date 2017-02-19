package sounds;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhouzhenjiang on 2017/2/2.
 */
public class BlackCD implements CompactDisc {

    private String title;

    private String auther;

    @Resource(name = "sounds")
    private List<String> sounds;

    public BlackCD() {
    }


    @Override
    public void play() {

        System.out.println("title:" + title);
        System.out.println("auther:"+auther);
        for(String s:sounds) {
            System.out.println("sounds:" + s);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public List<String> getSounds() {
        return sounds;
    }

    public void setSounds(List<String> sounds) {
        this.sounds = sounds;
    }
}
