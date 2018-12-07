package headfirst.day2.display;

import headfirst.day2.observer.Observer;
import headfirst.day2.subject.WeatherObject;

/**
 * 预测温度的布告板
 * @author : Lin Can
 * @date : 2018/12/7 21:59
 */
public class ForecastDisplay implements Observer,Display {
    private WeatherObject weatherObject;
    private Float temperature;
    private Float humidity;
    private Float pressure;

    public ForecastDisplay(WeatherObject weatherObject) {
        this.weatherObject = weatherObject;
        weatherObject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(" 预计未来的温度：" + (temperature + 3));
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        display();
    }
}
