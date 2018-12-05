package headfirst.day1.duck;

import headfirst.day1.fly.FlyBehavior;
import headfirst.day1.quack.QuackBehavior;

/**
 * 抽象类
 * @author : Lin Can
 * @date : 2018/12/5 23:19
 */
public abstract class Duck {
    /**
     * 飞的行为
     */
    FlyBehavior flyBehavior;

    /**
     * 叫的行为
     */
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void fly() {
        this.flyBehavior.fly();
    }

    public void quack() {
        this.quackBehavior.quack();
    }

    public abstract void display();

}
