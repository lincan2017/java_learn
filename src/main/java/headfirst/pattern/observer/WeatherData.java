package headfirst.pattern.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Lin Can
 * @description : 天气数据的获取
 * @modified ：By
 * @date : 2018/6/28 8:17
 */
public class WeatherData implements Subject {

    /**
     * 温度
     */
    private String temperature;

    /**
     * 湿度
     */
    private String humidity;

    /**
     * 气压
     */
    private String pressure;

    Set<Observer> observerSet;

    public WeatherData() {
        observerSet = new HashSet<>();
    }

    @Override
    public void registeObserver(Observer observer) {
        observerSet.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerSet.remove(observer);
    }

    /**
     * @author : Lin Can
     * @description : 有变化时通知所有注册了的观察者，调观察者的更新方法，把新数据传入
     * @dateCreated : 2018/6/28 8:27
     * @Param
     * @Return :
     */
    @Override
    public void notifyObserver() {
        for (Observer observer : observerSet) {
            observer.update(temperature,humidity,pressure);
        }
    }

    public String getTemperature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getPressure() {
        return pressure;
    }

    /**
     * @author : Lin Can
     * @description : 假设传感器获得数据后调用这个方法传入检测到的数据
     * @dateCreated : 2018/6/28 8:21
     * @Param temperature
    * @Param humidity
    * @Param pressure
     * @Return :
     */
    public void setWeather(String temperature,String humidity,String pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
