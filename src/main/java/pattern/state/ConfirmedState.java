package pattern.state;

/**
 * @author : Lin Can
 * @description : 订单状态接口确认收货状态
 * @modified ：By
 * @date : 2018/5/14 21:42
 */
public class ConfirmedState extends OrderStateImpl {

    public ConfirmedState(Test1 order) {
        super(order);
    }

    /**
     * @author : Lin Can
     * @description : 更新界面按钮
     * 所有按钮不可用，状态为已确认
     * @dateCreated : 2018/5/14 21:53
     * @Param
     * @Return :
     */
    @Override
    public void updateUI() {
        this.order.getBtnPay().setEnabled(false);
        order.getBtnRefund().setEnabled(false);
        order.getBtnConfirm().setEnabled(false);
        order.getLabelState().setText("已确认");
    }

    @Override
    public void pay() {
        throw new RuntimeException("已确认，不能重复付款");
    }

    @Override
    public void reFund() {
        throw new RuntimeException("已确认，不能退款");
    }

    @Override
    public void confirm() {
        throw new RuntimeException("已确认，不能重复确认");
    }
}
