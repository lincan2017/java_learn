package pattern.state;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author : Lin Can
 * @description : 用状态模式实现状态之间的转换
 * @modified ：By
 * @date : 2018/5/14 20:59
 */
public class Test1 extends  JFrame{

    /**
     * 付款按钮
     */
    private JButton btnPay;
    /**
     * 退款按钮
     */
    private JButton btnRefund;
    /**
     * 确认按钮
     */
    private JButton btnConfirm;
    /**
     * 显示当前状态
     */
    private JLabel labelState;
    /**
     * 可以使用的状态枚举
     */
    private IOrderState state;

    public JButton getBtnPay() {
        return btnPay;
    }

    public JButton getBtnRefund() {
        return btnRefund;
    }

    public JButton getBtnConfirm() {
        return btnConfirm;
    }

    public JLabel getLabelState() {
        return labelState;
    }

    public Test1() {
        //对话框的名字
        super("测试");
        //对话框的大小
        setSize(500,500);
        //默认的退出操作
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //是否可见
        setVisible(true);
        JPanel contentPane=new JPanel();
        setContentPane(contentPane);


        btnPay=new JButton("付款");
        //付款按钮添加按钮监听器
        btnPay.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //调用当前状态的支付方法
                Test1.this.state.pay();
            }
        });

        btnRefund=new JButton("退款");
        //为退款按钮添加按钮监听器
        btnRefund.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //调用当前状态的退款方法
                Test1.this.state.reFund();

            }
        });

        btnConfirm=new JButton("确认收货");
        //为确认按钮添加按钮监听器
        btnConfirm.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //调用当前状态的确认方法
                Test1.this.state.confirm();

            }
        });

        labelState = new JLabel();
        GridLayout gird=new GridLayout(3,3);
        contentPane.setLayout(gird);

        //添加各个按钮到控件中
        contentPane.add(btnPay);
        contentPane.add(btnRefund);
        contentPane.add(btnConfirm);
        contentPane.add(labelState);
        //初始化状态为未付款
        setState(new UnPayedState(this));
    }

    public void setState(IOrderState stat)
    {
        this.state = stat;
        //更新界面的按钮和状态
        this.state.updateUI();
    }

    public static void main(String[] args) {
        Test1 t =new Test1();
        t.pack();
    }

    //---------------心得-------------------------
    /**
     * 用状态模式代替if...else编程
     * 将状态定义为一个接口，新增一个状态就继承这个接口
     * 接口中定义每个状态可能需要进行的操作，有新的状态继承接口则必须实现这些操作，不会遗漏
     * if...else编程虽然一开始会很方法，但是逻辑如果复杂起来的时候容易丢三落四而且不好维护，每次需要全部代码读一遍
     * 可以让逻辑更加清晰，将状态不单单定义为一个状态，而是将状态随之需要进行的操作定义成一个类
     */
}
