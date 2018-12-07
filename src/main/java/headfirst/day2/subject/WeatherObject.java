package headfirst.day2.subject;

import headfirst.day2.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Lin Can
 * @date : 2018/12/7 21:37
 */
public class WeatherObject implements Subject {
    private List<Observer> observers;
    private Float temperature;
    private Float humidity;
    private Float pressure;

    public WeatherObject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index > 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObversers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 模拟传感器获取温度
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 压力
     */
    public void setWeatherObject (float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * 温度变化就会被调用
     */
    private void measurementsChanged () {
        //温度变化就要通知对应的订阅者
        notifyObversers();
    }
}
