package pattern.state;

/**
 * @author : Lin Can
 * @description : 订单状态的实现类退款状态
 * @modified ：By
 * @date : 2018/5/14 21:41
 */
public class RefundedState extends OrderStateImpl {
    public RefundedState(Test1 order) {
        super(order);
    }

    /**
     * @author : Lin Can
     * @description : 更新界面按钮和状态
     * 已退款，所有状态不可用
     * @dateCreated : 2018/5/14 22:05
     * @Param
     * @Return :
     */
    @Override
    public void updateUI() {
        order.getBtnPay().setEnabled(false);
        order.getBtnRefund().setEnabled(false);
        order.getBtnConfirm().setEnabled(false);
        order.getLabelState().setText("已退款");
    }

    @Override
    public void pay() {
        throw new RuntimeException("已退款，不能支付");
    }

    @Override
    public void reFund() {
        throw new RuntimeException("已退款，不能重复退款");
    }

    @Override
    public void confirm() {
        throw new RuntimeException("已退款，不能确认");
    }
}
