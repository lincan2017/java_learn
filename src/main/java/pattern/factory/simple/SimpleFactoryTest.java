package pattern.factory.simple;

/**
 * @author : Lin Can
 * @description : 测试简单工厂模式
 * @modified ：By
 * @date : 2018/6/18 21:58
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //小作坊模式
        SimpleFactory simpleFactory = new SimpleFactory();
        //用户要自己配置，可能会配置一个不存在的
        System.out.println(simpleFactory.getMilk("Telunsu"));
    }
}
