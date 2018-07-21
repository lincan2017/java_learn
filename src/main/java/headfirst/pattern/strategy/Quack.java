package headfirst.pattern.strategy;

/**
 * @author : Lin Can
 * @description : 鸭子叫声
 * @modified ：By
 * @date : 2018/6/27 8:22
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack,quack,quack...");
    }
}
