package headfirst.day2.display;

import headfirst.day2.observer.Observer;
import headfirst.day2.subject.WeatherObject;

/**
 * 当前天气布告板
 * @author : Lin Can
 * @date : 2018/12/7 21:46
 */
public class CurrentConditionDisplay implements Observer,Display {
    private WeatherObject weatherObject;
    private Float temperature;
    private Float humidity;
    private Float pressure;

    public CurrentConditionDisplay(WeatherObject weatherObject) {
        this.weatherObject = weatherObject;
        weatherObject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print(" 当前温度："+temperature);
        System.out.print(" 当前湿度："+humidity);
        System.out.println(" 当前压强："+pressure);
    }

    /**
     * 更新数据
     * @author : Lin Can
     * @date: 2018/12/7 21:57
     * @param temperature
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
