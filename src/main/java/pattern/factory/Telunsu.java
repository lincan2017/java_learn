package pattern.factory;

/**
 * @author : Lin Can
 * @description : 特仑苏类，牛奶的实现类
 * @modified ：By
 * @date : 2018/6/18 21:35
 */
public class Telunsu implements Milk{

    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
