package pattern.state;

/**
 * @author : Lin Can
 * @description : 订单状态接口的抽象实现类型
 * @modified ：By
 * @date : 2018/5/14 21:56
 */
public abstract class OrderStateImpl implements IOrderState {
    protected Test1 order;

    public OrderStateImpl(Test1 order) {
        this.order = order;
    }
}
