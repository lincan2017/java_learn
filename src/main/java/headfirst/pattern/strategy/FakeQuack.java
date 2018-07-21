package headfirst.pattern.strategy;

/**
 * @author : Lin Can
 * @description : 假叫
 * @modified ：By
 * @date : 2018/6/27 8:52
 */
public class FakeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("qwak,qwak,qwak...");
    }
}
