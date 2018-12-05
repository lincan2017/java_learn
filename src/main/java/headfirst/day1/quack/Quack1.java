package headfirst.day1.quack;

/**
 * 叫的行为的子类
 * @author : Lin Can
 * @date : 2018/12/5 23:23
 */
public class Quack1 implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack1,Quack1,Quack1......");
    }
}
