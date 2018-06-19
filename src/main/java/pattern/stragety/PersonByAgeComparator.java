package pattern.stragety;

import java.util.Comparator;

/**
 * @author : Lin Can
 * @description : Person实体的按年龄排序的比较器
 * @modified ：By
 * @date : 2018/5/15 17:20
 */
public class PersonByAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()-o2.getAge();
    }
}
