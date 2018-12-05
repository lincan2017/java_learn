package headfirst.day1.quack;

/**
 * 叫行为的子类
 * @author : Lin Can
 * @date : 2018/12/5 23:28
 */
public class QuackNoSound implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack");
    }
}
