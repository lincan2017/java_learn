package headfirst.pattern.decorator;

/**
 * @author : Lin Can
 * @description : 饮料抽象类
 * @modified ：By
 * @date : 2018/7/5 8:07
 */
public abstract class Beverage {
    String description = "unknown Beverage" ;
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
