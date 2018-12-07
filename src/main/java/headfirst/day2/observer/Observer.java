package headfirst.day2.observer;

/**
 * 观察者接口
 * @author : Lin Can
 * @date : 2018/12/7 21:26
 */
public interface Observer {
    /**
     * 更新
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 压力
     */
    void update(float temperature, float humidity, float pressure);
}
