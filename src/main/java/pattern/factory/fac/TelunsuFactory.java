package pattern.factory.fac;

import pattern.factory.Milk;
import pattern.factory.Telunsu;

/**
 * @author : Lin Can
 * @description :特仑苏工厂
 * @modified ：By
 * @date : 2018/6/18 22:38
 */
public class TelunsuFactory implements MilkFactory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
