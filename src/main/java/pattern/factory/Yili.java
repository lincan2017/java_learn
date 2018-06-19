package pattern.factory;

/**
 * @author : Lin Can
 * @description : 伊利类，牛奶的实现类
 * @modified ：By
 * @date : 2018/6/18 21:36
 */
public class Yili implements Milk {

    @Override
    public Milk getMilk () {
        return new Yili();
    }
}
