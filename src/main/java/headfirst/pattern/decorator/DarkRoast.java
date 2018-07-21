package headfirst.pattern.decorator;

/**
 * @author : Lin Can
 * @description : 深烘培的咖啡
 * @modified ：By
 * @date : 2018/7/5 8:17
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.55;
    }
}
