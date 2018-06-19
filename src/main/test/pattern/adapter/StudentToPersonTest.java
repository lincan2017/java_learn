
package pattern.adapter;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.util.Calendar;

/**
    * @author:Lin Can
    * @since:05/18/2018
    * @version 1.0 
*/
public class StudentToPersonTest { 

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /** 
    * 
    * Method: toPerson(Student student) 
    * 
    */ 
    @Test
    public void testToPerson() throws Exception {
        Student student = new Student();
        Calendar calendar = Calendar.getInstance();
        calendar.set(1994,4,28);
        student.setBirthDay(calendar.getTime());
        student.setXing("林");
        student.setMing("灿");

        Person person = StudentToPerson.toPerson(student);
        System.out.println(person);
    } 

    //-----------------心得---------------------------------
    /**
     * 用适配器模式，可以将旧对象适用于新事物。
     * 如：此例中的Student是一个旧类，系统中有一个新事物需要用到该旧对象的数据，但是只能传入Person对象
     * 所以需要定义一个toPerson方法，将student对象转换为person，Person类就是Student类在新事物的适配器，
     * 让Student类型的对象可以输出。
     */

} 
