package headfirst.pattern.decorator;

/**
 * @author : Lin Can
 * @description : 豆浆调料
 * @modified ：By
 * @date : 2018/7/5 8:32
 */
public class Soy extends Condiment{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
