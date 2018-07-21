package headfirst.pattern.factory;

import headfirst.pattern.factory.pizza.*;
import org.apache.commons.lang3.StringUtils;

/**
 * 简单工厂
 * @author : Lin Can
 * @date : 2018/7/21 10:52
 */
public class SimplePizzaFactory {

    /**
     * Pizza种类枚举
     * @author : Lin Can
     * @date: 2018/7/21 11:03
     */
    public enum PizzaType {
        CHEESE,PEPPERONI,CLAM,VEGGIE;
    }

    /**
     * 根据不同的类型创建不同的pizza
     * @author : Lin Can
     * @date: 2018/7/21 11:02
     * @param type
     * @return: headfirst.pattern.factory.pizza.Pizza
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (StringUtils.isBlank(type)) {
            return pizza;
        }
        if (PizzaType.CHEESE.name().equals(type)) {
            pizza = new CheesePizza();
        } else if (PizzaType.PEPPERONI.name().equals(type)) {
            pizza = new PepperoniPizza();
        } else if (PizzaType.CLAM.name().equals(type)) {
            pizza = new ClamPizza();
        } else if (PizzaType.VEGGIE.name().equals(type)) {
            pizza = new VeggiePizza();
        } else {
            throw new RuntimeException("没有该类型的Pizza");
        }
        return pizza;
    }
}
