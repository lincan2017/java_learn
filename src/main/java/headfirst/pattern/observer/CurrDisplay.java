package headfirst.pattern.observer;

/**
 * @author : Lin Can
 * @description : 当前数据布告板
 * @modified ：By
 * @date : 2018/6/28 8:33
 */
public class CurrDisplay implements Observer,DisplayElement {

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

    /**
     * @author : Lin Can
     * @description : 展示到布告板上（此处粗略地作一下打印代表展示了）
     * @dateCreated : 2018/6/28 8:39
     * @Param
     * @Return :
     */
    @Override
    public void display() {
        System.out.println("Temperature is " +  temperature
                + "; Humidity is" + humidity
                + "; Pressure is " + pressure
        );
    }

    /**
     * @author : Lin Can
     * @description : 更新当前布告板需要的数
     * @dateCreated : 2018/6/28 8:38
     * @Param temperature 温度
    * @Param humidity 湿度
    * @Param pressure  气压
     * @Return :
     */
    @Override
    public void update(String temperature, String humidity, String pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
