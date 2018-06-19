
package pattern.stragety; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.util.Arrays;

/**
    * @author:Lin Can
    * @since:05/15/2018
    * @version 1.0 
*/
public class PersonByAgeComparatorTest { 

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /** 
    * 
    * Method: compare(Person o1, Person o2) 
    * 
    */ 
    @Test
    public void testCompare() throws Exception { 
        Person[] persons = new Person[5];
        persons[0] = new Person(1,"yzk",18,180);
        persons[1] = new Person(8,"秦岚",25,130);
        persons[2] = new Person(6,"贾玲",22,160);
        persons[3] = new Person(7,"冯提莫",21,150);
        persons[4] = new Person(3,"金莲",38,155);

        Arrays.sort(persons,new PersonByAgeComparator());

        for (Person p : persons) {
            System.out.println(p);
        }
    } 
    //-----------------心得----------------------------------------------
    /**
     * 使用Arrays.sort方法进行排序的时候，如果是根据实体类进行排序的时候，可以定义一个比较器
     * 对于非基本类型Arrays类提供了sort排序算法，排序算法是固定的，但是算法确定不了的是“如何比较两个对象的大小”，
     * 因此把这个比较的算法通过策略接口Comparator开放出来：
     *
     如果要修改排序方式，只要提供不同的Comparator实现类即可
     */

} 
