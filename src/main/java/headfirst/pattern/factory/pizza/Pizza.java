package headfirst.pattern.factory.pizza;

/**
 * pizza父类
 * @author : Lin Can
 * @date : 2018/7/21 9:22
 */
public abstract class Pizza {
    /**
     * 准备
     */
    public abstract void prepare();

    /**
     * 烘焙
     */
    public abstract void bake();

    /**
     * 切块
     */
    public abstract void cut();

    /**
     * 装盒
     */
    public abstract void box();
}
