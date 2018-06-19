package pattern.factory.simple;

import pattern.factory.Mengniu;
import pattern.factory.Milk;
import pattern.factory.Telunsu;
import pattern.factory.Yili;

/**
 * @author : Lin Can
 * @description : 简单工厂模式
 * @modified ：By
 * @date : 2018/6/18 21:44
 */
public class SimpleFactory {
    public Milk getMilk (String name) {
        if ("Telunsu".equals(name)) {
            return new Telunsu();
        } else if ("Yili".equals(name)) {
            return new Yili();
        } else if ("Mengniu".equals(name)) {
            return new Mengniu();
        } else {
            throw new RuntimeException("没有该类型对应的牛奶");
        }
    }
}
