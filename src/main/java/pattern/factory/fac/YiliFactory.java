package pattern.factory.fac;

import pattern.factory.Milk;
import pattern.factory.Yili;

/**
 * @author : Lin Can
 * @description : 伊利的工厂
 * @modified ：By
 * @date : 2018/6/18 22:35
 */
public class YiliFactory implements MilkFactory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
