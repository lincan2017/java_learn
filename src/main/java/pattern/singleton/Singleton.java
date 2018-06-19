package pattern.singleton;

/**
 * @author : Lin Can
 * @description : 饿汉式单例模式
 * @modified ：By
 * @date : 2018/5/29 8:11
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {

    }
    public static Singleton getInstance () {
        return singleton;
    }

    /**
     * 这种方式叫饿汉式，在该类初始化的时候就会生成该单例
     * 但实际上，存在该单例的时候，我们不一定马上使用，这样子在资源上会一直占用
     * 所以才有懒汉式
     */

}
