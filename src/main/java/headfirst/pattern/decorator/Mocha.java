package headfirst.pattern.decorator;

/**
 * @author : Lin Can
 * @description : 摩卡调料
 * @modified ：By
 * @date : 2018/7/5 8:20
 */
public class Mocha extends Condiment {

    /**
     * 用一个实例变量记录饮料，也就是被装饰者
     */
    Beverage beverage;

    /**
     * 让被装饰者被记录到变量中
     * 因此把饮料当作构造器的参数，再由构造器将此饮料记录到实例变量中
     * @param beverage
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * @author : Lin Can
     * @description : 获得描述  在饮料的基础上加上调料
     * @dateCreated : 2018/7/5 8:26
     * @Param
     * @Return :
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * @author : Lin Can
     * @description : 即使花费  饮料的基础上加上调料的价格
     * @dateCreated : 2018/7/5 8:27
     * @Param
     * @Return :
     */
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
