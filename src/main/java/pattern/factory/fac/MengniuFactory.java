package pattern.factory.fac;

import pattern.factory.Mengniu;
import pattern.factory.Milk;

/**
 * @author : Lin Can
 * @description : 蒙牛的工厂
 * @modified ：By
 * @date : 2018/6/18 22:37
 */
public class MengniuFactory implements MilkFactory {
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
