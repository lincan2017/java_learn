package headfirst.pattern.decorator;

/**
 * @author : Lin Can
 * @description : 浓缩咖啡具体类
 * @modified ：By
 * @date : 2018/7/5 8:12
 */
public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
