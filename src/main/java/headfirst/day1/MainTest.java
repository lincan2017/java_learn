package headfirst.day1;

import headfirst.day1.duck.Duck;
import headfirst.day1.duck.ModelDuck;
import headfirst.day1.fly.FlyWithRocket;

/**
 * @author : Lin Can
 * @date : 2018/12/5 23:38
 */
public class MainTest {
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.display();
        duck.fly();
        duck.quack();
        duck.setFlyBehavior(new FlyWithRocket());
        duck.fly();
    }
}
