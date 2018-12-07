package headfirst.day2;

import headfirst.day2.display.CurrentConditionDisplay;
import headfirst.day2.display.ForecastDisplay;
import headfirst.day2.subject.WeatherObject;

/**
 * @author : Lin Can
 * @date : 2018/12/7 21:51
 */
public class MainTest {
    public static void main(String[] args) {
        WeatherObject weatherObject = new WeatherObject();
        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherObject);
        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherObject);

        //有两个布告板会收到消息，并更新
        weatherObject.setWeatherObject(19.5f, 23.2f, 15.9f);
        weatherObject.setWeatherObject(16.5f, 25.2f, 10.9f);
        weatherObject.setWeatherObject(13.5f, 28.2f, 5.9f);

        //预测温度的布告板取消了订阅之后，只有当前布告板可以获得更新
        System.out.println("----------------预测温度的布告板取消了对温度的订阅------------");
        weatherObject.removeObserver(forecastDisplay);

        weatherObject.setWeatherObject(20.5f,25.8f,17.9f);

        //预测温度的布告板又关注了这个主题，所以后面的更新又可以收到并显示
        System.out.println("-----------------预测温度的布告板又注册了对温度的订阅-----------");
        weatherObject.registerObserver(forecastDisplay);

        weatherObject.setWeatherObject(22.5f,12.8f,25.9f);



    }
    /**
     * 输出结果
     * -------------------------------------------------------------------- *
     * 当前温度：19.5 当前湿度：23.2 当前压强：15.9
     *  预计未来的温度：22.5
     *  当前温度：16.5 当前湿度：25.2 当前压强：10.9
     *  预计未来的温度：19.5
     *  当前温度：13.5 当前湿度：28.2 当前压强：5.9
     *  预计未来的温度：16.5
     * ----------------预测温度的布告板取消了对温度的订阅------------
     *  当前温度：20.5 当前湿度：25.8 当前压强：17.9
     * -----------------预测温度的布告板又注册了对温度的订阅-----------
     *  当前温度：22.5 当前湿度：12.8 当前压强：25.9
     *  预计未来的温度：25.5
     *  ------------------------------------------------------------------- *
     */
}
