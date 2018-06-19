package pattern.state;

/**
 * @author : Lin Can
 * @description : 订单状态的枚举类
 * @modified ：By
 * @date : 2018/5/14 20:55
 */
public enum OrderState {
    UNPAYED("未支付"),
    PAYED("已支付"),
    REFUND("退款"),
    COMFIRMED("确认收货");

    OrderState(String stateMeaning) {
    }
}
