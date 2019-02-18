package headfirst.pattern.adapter.demo.animal;

/**
 * @author : Lin Can
 * @date : 2019/2/18 9:39
 */
public class RedTurkey implements Turkey{

    @Override
    public String cackle() {
        return "Cackle, Cackle, Cackle...";
    }

    @Override
    public String fly() {
        return "I can fly a short distance.";
    }
}
