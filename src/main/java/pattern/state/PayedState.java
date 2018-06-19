package pattern.state;

/**
 * @author : Lin Can
 * @description : 订单状态的实现类支付状态
 * @modified ：By
 * @date : 2018/5/14 21:40
 */
public class PayedState extends OrderStateImpl {

    public PayedState(Test1 order) {
        super(order);
    }
    /**
     * @author : Lin Can
     * @description : 更新界面的按钮和状态
     * 已支付状态可以退款和确认，支付按钮不可用
     * @dateCreated : 2018/5/14 22:13
     * @Param
     * @Return :
     */
    @Override
    public void updateUI() {
        order.getBtnPay().setEnabled(false);
        order.getBtnRefund().setEnabled(true);
        order.getBtnConfirm().setEnabled(true);
        order.getLabelState().setText("已支付");
    }

    @Override
    public void pay() {
        throw new RuntimeException("已支付，不能重复支付");
    }

    @Override
    public void reFund() {
        order.setState(new RefundedState(order));
    }

    @Override
    public void confirm() {
        order.setState(new ConfirmedState(order));
    }
}
