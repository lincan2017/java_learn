package headfirst.pattern.strategy;

/**
 * @author : Lin Can
 * @description : 模型鸭
 * @modified ：By
 * @date : 2018/6/27 8:50
 */
public class ModelDuck extends Duck {
    @Override
    void display() {
        System.out.println("I look like a real duck");
    }
}
