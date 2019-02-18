package headfirst.pattern.adapter.demo.animal;

/**
 * @author : Lin Can
 * @date : 2019/2/18 9:45
 */
public class GreenDuck implements Duck{
    @Override
    public String quack() {
        return "Quack, Quack, Quack...";
    }

    @Override
    public String fly() {
        return "I can fly...";
    }
}
