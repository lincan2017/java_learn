package headfirst.pattern.strategy;

/**
 * @author : Lin Can
 * @description : 以火箭为动力飞
 * @modified ：By
 * @date : 2018/6/27 8:53
 */
public class FlyRocketPowered implements FlyBehaviur{
    @Override
    public void fly() {
        System.out.println("I can fly with rocket power");
    }
}
