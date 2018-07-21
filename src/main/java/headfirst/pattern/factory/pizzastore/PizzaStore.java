package headfirst.pattern.factory.pizzastore;

import headfirst.pattern.factory.pizzafactory.SimplePizzaFactory;
import headfirst.pattern.factory.pizza.Pizza;

/**
 * @author : Lin Can
 * @date : 2018/7/21 10:51
 */
public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    /**
     * 订pizza
     * @author : Lin Can
     * @date: 2018/7/21 11:09
     * @param type
     * @return: headfirst.pattern.factory.pizza.Pizza
     */
    public Pizza orderPizza (String type) {
        Pizza pizza;

        //让工厂生产Pizza
        pizza = simplePizzaFactory.createPizza(type);

        //其他常规流程
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
