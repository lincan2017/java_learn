package pattern.factory.fac;

/**
 * @author : Lin Can
 * @description : 工厂模式测试
 * @modified ：By
 * @date : 2018/6/18 22:38
 */
public class FactoryTest {
    public static void main(String[] args) {
        //指定一个工厂来生产牛奶，但是用户需要指定哪个工厂
        MilkFactory milkFactory = new MengniuFactory();
        System.out.println(milkFactory.getMilk());
    }
}
