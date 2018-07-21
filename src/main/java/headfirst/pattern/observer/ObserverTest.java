package headfirst.pattern.observer;

/**
 * @author : Lin Can
 * @description : 测试观察者模式
 * @modified ：By
 * @date : 2018/6/28 8:42
 */
public class ObserverTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrDisplay currDisplay = new CurrDisplay();

        //注册布告板
        weatherData.registeObserver(currDisplay);

        for (int i=0; i<10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            weatherData.setWeather((10+i)+"℃",(65+i)+"rh",(58+i)+"P");
            weatherData.notifyObserver();
            //布告板展示数据
            currDisplay.display();
        }
    }
}
