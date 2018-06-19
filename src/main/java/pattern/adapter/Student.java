package pattern.adapter;

import java.util.Date;

/**
 * @author : Lin Can
 * @description : 此类对应于适配器模式的旧类
 * @modified ：By
 * @date : 2018/5/18 8:53
 */
public class Student {
    private String xing;
    private String ming;
    private Date birthDay;

    public String getXing() {
        return xing;
    }

    public void setXing(String xing) {
        this.xing = xing;
    }

    public String getMing() {
        return ming;
    }

    public void setMing(String ming) {
        this.ming = ming;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
