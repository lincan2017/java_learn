package headfirst.day1.duck;

import headfirst.day1.fly.FlyWithWing;
import headfirst.day1.quack.Quack1;

/**
 * @author : Lin Can
 * @date : 2018/12/5 23:37
 */
public class SmallYellowDuck extends Duck {
    public SmallYellowDuck() {
        flyBehavior = new FlyWithWing();
        quackBehavior= new Quack1();
    }

    @Override
    public void display() {
        System.out.println("I'm yellow and small!");
    }
}
