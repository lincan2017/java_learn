package pattern.adapter;

import java.util.Calendar;

/**
 * @author : Lin Can
 * @description : 将Student类转换为Person
 * @modified ：By
 * @date : 2018/5/18 8:55
 */
public class StudentToPerson {
    public static Person toPerson (Student student) {
        Person person = new Person();
        Calendar nowCalendar = Calendar.getInstance();
        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.setTime(student.getBirthDay());

        person.setName(student.getXing()+student.getMing());
        person.setAge(nowCalendar.compareTo(birthCalendar));
        return person;
    }
}
