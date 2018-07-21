package headfirst.pattern.strategy;

/**
 * @author : Lin Can
 * @description : 用翅膀飞
 * @modified ：By
 * @date : 2018/6/27 8:19
 */
public class FlyWithWing implements FlyBehaviur {
    @Override
    public void fly() {
        System.out.println("I can fly with wings");
    }
}
