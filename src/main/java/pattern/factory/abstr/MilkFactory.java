package pattern.factory.abstr;

import pattern.factory.Mengniu;
import pattern.factory.Milk;
import pattern.factory.Telunsu;
import pattern.factory.Yili;

/**
 * @author : Lin Can
 * @description : 抽象工厂的实现类
 * @modified ：By
 * @date : 2018/6/18 22:43
 */
public class MilkFactory extends AbstractFac {
    @Override
    public Milk getMengniu() {
        return new Mengniu();
    }

    @Override
    public Milk getYili() {
        return new Yili();
    }

    @Override
    public Milk getTelunsu() {
        return new Telunsu();
    }
}
