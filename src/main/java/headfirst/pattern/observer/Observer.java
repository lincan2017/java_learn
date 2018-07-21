package headfirst.pattern.observer;

/**
 * @author : Lin Can
 * @description : 观察者接口
 * @modified ：By
 * @date : 2018/6/28 8:12
 */
public interface Observer {
    void update(String temperature,String humidity,String pressure);
}
