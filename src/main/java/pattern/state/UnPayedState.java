package pattern.state;

/**
 * @author : Lin Can
 * @description : 订单状态接口的实现类，未支付状态
 * @modified ：By
 * @date : 2018/5/14 21:31
 */
public class UnPayedState extends OrderStateImpl{

    public UnPayedState(Test1 order) {
        super(order);
    }
    /**
     * @author : Lin Can
     * @description : 更新界面的按钮和状态
     * 未支付状态下只能点击支付按钮，其他不可用
     * @dateCreated : 2018/5/14 22:01
     * @Param
     * @Return :
     */
    @Override
    public void updateUI() {
        order.getBtnPay().setEnabled(true);
        order.getBtnRefund().setEnabled(false);
        order.getBtnConfirm().setEnabled(false);
        order.getLabelState().setText("未支付");
    }

    @Override
    public void pay() {
        order.setState(new PayedState(order));
    }

    @Override
    public void reFund() {
        throw new RuntimeException("未支付状态下不能退款");
    }

    @Override
    public void confirm() {
        throw new RuntimeException("未支付状态下不能确认");
    }
}
