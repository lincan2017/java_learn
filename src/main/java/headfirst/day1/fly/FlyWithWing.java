package headfirst.day1.fly;

/**
 * 飞行为的子类
 * @author : Lin Can
 * @date : 2018/12/5 23:27
 */
public class FlyWithWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cam fly with wings");
    }
}
