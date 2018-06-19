package pattern.factory.abstr;

import pattern.factory.Milk;

/**
 * @author : Lin Can
 * @description : 抽象工厂
 * @modified ：By
 * @date : 2018/6/18 22:41
 */
public abstract class AbstractFac {
    abstract Milk getMengniu ();
    abstract Milk getYili ();
    abstract Milk getTelunsu ();

}
