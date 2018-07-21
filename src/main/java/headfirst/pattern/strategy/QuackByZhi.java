package headfirst.pattern.strategy;

/**
 * @author : Lin Can
 * @description : 吱吱叫
 * @modified ：By
 * @date : 2018/6/27 8:23
 */
public class QuackByZhi implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("zhi,zhi,zhi...");
    }
}
