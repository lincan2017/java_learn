
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
public class PersonByHeightComparatorTest { 

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

        Arrays.sort(persons,new PersonByHeightComparator());

        for (Person p : persons) {
            System.out.println(p);
        }
    } 
    

} 
