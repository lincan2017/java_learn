package pattern.state;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author : Lin Can
 * @description : 用if...else的方式实现状态之间的转换
 * @modified ：By
 * @date : 2018/5/14 20:59
 */
public class Test0 extends  JFrame{

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
    private OrderState state;

    public Test0() {
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
                //只有当前状态是未支付，才能将状态转换为支付，其他情况都是不允许的
                if(Test0.this.state==OrderState.UNPAYED)
                {
                    Test0.this.setState(OrderState.PAYED);
                }
                else if(Test0.this.state==OrderState.PAYED)
                {
                    throw new RuntimeException("已经支付，不需要重复支付");
                }
                else if(Test0.this.state==OrderState.REFUND)
                {
                    throw new RuntimeException("已退款，不能支付");
                }
                else if(Test0.this.state==OrderState.COMFIRMED)
                {
                    throw new RuntimeException("已确认，不能支付");
                }
                else
                {
                    throw new RuntimeException("未知的OrderState");
                }

            }
        });

        btnRefund=new JButton("退款");
        //为退款按钮添加按钮监听器
        btnRefund.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //只有当前状态是支付状态才能退款，其他状态不可以退款
                if(Test0.this.state==OrderState.UNPAYED)
                {
                    throw new RuntimeException("未支付，不能退款");
                }
                else if(Test0.this.state==OrderState.PAYED)
                {
                    Test0.this.setState(OrderState.REFUND);
                }
                else if(Test0.this.state==OrderState.REFUND)
                {
                    throw new RuntimeException("已经退款，不能重复退款");
                }
                else if(Test0.this.state==OrderState.COMFIRMED)
                {
                    throw new RuntimeException("已经确认，不能退款");
                }
                else
                {
                    throw new RuntimeException("未知的OrderState");
                }

            }
        });

        btnConfirm=new JButton("确认收货");
        //为确认按钮添加按钮监听器
        btnConfirm.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //只有当前状态是已支付才能将状态修改为确认收货，其他状态都不可以确认
                if(Test0.this.state==OrderState.UNPAYED)
                {
                    throw new RuntimeException("未支付，不能确认");
                }
                else if(Test0.this.state==OrderState.PAYED)
                {
                    Test0.this.setState(OrderState.COMFIRMED);
                }
                else if(Test0.this.state==OrderState.REFUND)
                {
                    throw new RuntimeException("已经退款，不能确认");
                }
                else if(Test0.this.state==OrderState.COMFIRMED)
                {
                    throw new RuntimeException("已经确认，不能重复确认");
                }
                else
                {
                    throw new RuntimeException("未知的OrderState");
                }

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
        setState(OrderState.UNPAYED);
    }

    public void setState(OrderState stat)
    {
        this.state = stat;
        //如果当前状态是未支付，则付款按钮可用，其他不可用，显示的状态为未付款
        if(this.state==OrderState.UNPAYED)
        {
            this.btnConfirm.setEnabled(false);
            this.btnPay.setEnabled(true);
            this.btnRefund.setEnabled(false);
            this.labelState.setText("未支付");
        }
        else if(this.state==OrderState.PAYED)
        {
            //如果当前状态为支付，则退款和确认按钮可用，其他不可用，同时显示状态为已支付
            this.btnConfirm.setEnabled(true);
            this.btnPay.setEnabled(false);
            this.btnRefund.setEnabled(true);
            this.labelState.setText("已支付");
        }
        else if(this.state==OrderState.REFUND)
        {
            //如果当前状态为退款，则所有的按钮都不可以用，状态显示为退款
            this.btnConfirm.setEnabled(false);
            this.btnPay.setEnabled(false);
            this.btnRefund.setEnabled(false);
            this.labelState.setText("已退款");
        }
        else if(this.state==OrderState.COMFIRMED)
        {
            //如果当前状态为已确认，则所有按钮不可用，状态显示为已确认
            this.btnConfirm.setEnabled(false);
            this.btnPay.setEnabled(false);
            this.btnRefund.setEnabled(false);
            this.labelState.setText("确认收货");
        }
        else
        {
            throw new RuntimeException("未知的OrderState");
        }
    }

    public static void main(String[] args) {
        Test0  t =new Test0();
        t.pack();
    }
}
