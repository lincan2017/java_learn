package headfirst.pattern.decorator;

/**
 * @author : Lin Can
 * @description : 奶泡调料
 * @modified ：By
 * @date : 2018/7/5 8:34
 */
public class Whip extends Condiment{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
}
