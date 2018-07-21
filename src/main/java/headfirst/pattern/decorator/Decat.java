package headfirst.pattern.decorator;

/**
 * @author : Lin Can
 * @description : 低咖啡因
 * @modified ：By
 * @date : 2018/7/5 8:18
 */
public class Decat extends Beverage{

    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 1.45;
    }
}
