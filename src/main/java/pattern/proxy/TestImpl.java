package pattern.proxy;

/**
 * @author : Lin Can
 * @description : 代理模式的被代理类
 * @modified ：By
 * @date : 2018/5/28 14:03
 */
public class TestImpl implements ITest {
    private TestImpl(){

    }
    public static TestImpl getTestImpl(){
        return new TestImpl();
    }
    @Override
    public void test1() {
        System.out.println("这是test1");
    }

    @Override
    public void test2(String str) {
        System.out.println("这是test2，参数是："+str);
    }
}
