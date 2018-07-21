package headfirst.pattern.decorator;

/**
 * @author : Lin Can
 * @description : 星巴克首先咖啡
 * @modified ：By
 * @date : 2018/7/5 8:13
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
