package pattern.stragety;

import java.util.Comparator;

/**
 * @author : Lin Can
 * @description : Person实体的按身高排序的比较器
 * @modified ：By
 * @date : 2018/5/15 17:20
 */
public class PersonByHeightComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getHeight()-o2.getHeight();
    }
}
