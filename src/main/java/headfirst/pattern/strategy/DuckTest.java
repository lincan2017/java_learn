package headfirst.pattern.strategy;

/**
 * @author : Lin Can
 * @description :
 * @modified ：By
 * @date : 2018/6/27 8:35
 */
public class DuckTest {
    public static void main(String[] args) {
        //绿头鸭
        Duck greenDuck = new GreenHeadDuck();
        //模型鸭
        Duck modelDuck = new ModelDuck();

        //不能飞
        greenDuck.setFlyBehaviur(new FlyNoWIng());
        //嘎嘎叫
        greenDuck.setQuackBehavior(new Quack());

        //不会飞
        modelDuck.setFlyBehaviur(new FlyRocketPowered());
        //假叫
        modelDuck.setQuackBehavior(new FakeQuack());

        //鸭子展示
        greenDuck.show();
        System.out.println("---------------------------");
        modelDuck.show();


    }
}
