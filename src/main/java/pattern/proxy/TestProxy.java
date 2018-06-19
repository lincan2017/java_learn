package pattern.proxy;

/**
 * @author : Lin Can
 * @description : 测试代理模式
 * @modified ：By
 * @date : 2018/5/28 14:17
 */
public class TestProxy {
    public static void main(String[] args) {
        TestImpl test = TestImpl.getTestImpl();
        ITest iTest = (ITest) new DynamicProxy().bind(test);
        iTest.test1();
        iTest.test2("哇哈哈哈");
    }
}
