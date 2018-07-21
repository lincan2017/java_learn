package headfirst.pattern.strategy;

/**
 * @author : Lin Can
 * @description : 鸭子的父类 鸭子的共同部分
 * @modified ：By
 * @date : 2018/6/27 8:12
 */
public abstract class Duck {


    /**
     * 飞的行为接口
     */
    FlyBehaviur flyBehaviur;
    /**
     * 叫的行为接口
     */
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehaviur(FlyBehaviur flyBehaviur) {
        this.flyBehaviur = flyBehaviur;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 外观
     */
    abstract void display();

    /**
     * @author : Lin Can
     * @description : 展示这只鸭子
     * @dateCreated : 2018/6/27 8:40
     * @Param
     * @Return :
     */
    void show () {
        display();
        flyBehaviur.fly();
        quackBehavior.quack();
    }
}
