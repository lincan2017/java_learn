package headfirst.day1.duck;

import headfirst.day1.fly.FlyNoWay;
import headfirst.day1.quack.QuackNoSound;

/**
 * Duck的具体实现类
 * @author : Lin Can
 * @date : 2018/12/5 23:30
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackNoSound();
    }

    @Override
    public void display() {
        System.out.println("I'm a model which look like a duck, but not real.");
    }
}
