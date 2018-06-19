package pattern.singleton;

/**
 * @author : Lin Can
 * @description : 懒汉式单例模式
 * @modified ：By
 * @date : 2018/5/29 8:15
 */
public class SingletonPlus {
    private static SingletonPlus singleton = null;

    private SingletonPlus() {

    }

    public static SingletonPlus getInstance () {
        //只有在调用的时候才判断是否为空，是否需要创建新的对象，所以效率高
        if (singleton == null) {
            //安全
            synchronized (SingletonPlus.class) {
                //双重校验
                if (singleton == null) {
                    singleton = new SingletonPlus();
                }
            }
        }
        return singleton;
    }

    /**
     * 懒汉式单例，即在需要的时候再创建对象，不需要不创建
     * 并且加入了锁机制，可以避免并发带来多个实例的结果，安全
     * 加入了双重判断，可以提高效率
     */
}
