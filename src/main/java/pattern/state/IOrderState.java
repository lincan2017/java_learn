package pattern.state;

/**

 * @author : Lin Can
 * @description : 各种状态的接口
 * @modified ：By
 * @date : 2018/5/14 21:27
 */
public interface IOrderState {
    /**
     * 更新界面按钮和状态的方法
     */
    void updateUI();

    /**
     * 支付操作
     */
    void pay();

    /**
     * 退款方法
     */
    void reFund();

    /**
     * 确认收货方法
     */
    void confirm();
}
