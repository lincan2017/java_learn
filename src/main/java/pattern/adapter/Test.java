package pattern.adapter;

import java.io.IOException;

/**
 * @author : Lin Can
 * @description : 测试适配器模式之将Computer的关流方式可以AutoCloseable
 * @modified ：By
 * @date : 2018/5/18 9:25
 */
public class Test {

    public static void main(String[] args) {

        //这是不可以的，因为computer没有实现AutoCloseable接口
        /*try(Computer computer = new Computer();
        computer.play();){

        }*/

        Computer computer = new Computer();
        try(CloseableComputer closeableComputer = new CloseableComputer(computer)){
            computer.play();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //-----------心得-----------------------------
    /**
     * 通过CloseableComputer适配器的作用，可以使得Computer适应于try(){}这种形式，自动关流
     * 注意，适配器和旧的待适配对象没有继承关系，只是组合关系
     */
}
