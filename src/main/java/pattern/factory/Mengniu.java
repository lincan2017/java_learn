package pattern.factory;

/**
 * @author : Lin Can
 * @description : 蒙牛类，牛类类的实现类
 * @modified ：By
 * @date : 2018/6/18 21:38
 */
public class Mengniu implements Milk {

    @Override
    public Milk getMilk () {
        return new Mengniu();
    }
}
