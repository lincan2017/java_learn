package pattern.factory.abstr;

/**
 * @author : Lin Can
 * @description : 抽象工厂模式的实现的测试类
 * @modified ：By
 * @date : 2018/6/18 22:45
 */
public class AbstracFacTest {
    public static void main(String[] args) {
        //避免了用户自己配置
        MilkFactory milkFactory = new MilkFactory();
        System.out.println(milkFactory.getMengniu());
    }
}
