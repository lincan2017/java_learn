package headfirst.pattern.strategy;

/**
 * @author : Lin Can
 * @description : 不能飞
 * @modified ：By
 * @date : 2018/6/27 8:20
 */
public class FlyNoWIng implements FlyBehaviur {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
