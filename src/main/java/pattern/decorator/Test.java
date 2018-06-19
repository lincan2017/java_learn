package pattern.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Lin Can
 * @description : 测试装饰者模式
 * @modified ：By
 * @date : 2018/5/18 9:45
 */
public class Test {
    /*public static List getList() {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        return list;
    }*/

    public static List getList() {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //返回时将原来的list包装后再返回
        return new ReadOnlyList(list);
        /**
         * 此时，如果外部获取到该对象后如果要修改就会抛出异常
         * Exception in thread "main" java.lang.RuntimeException: 该类只读，不能修改
         * 	at pattern.decorator.ReadOnlyList.remove(ReadOnlyList.java:67)
         * 	at pattern.decorator.Test.main(Test.java:34)
         *
         * Process finished with exit code 1
         */
    }
    public static void main(String[] args) {
        List<Integer> list = getList();
        //用原来的list可以删除
        list.remove(2);
        for (Integer temp : list) {
            System.out.println(temp);
        }
    }

    //----------------------心得----------------------
    /**
     * 装饰者模式中，装饰者和被装饰者之间的关系是继承，实现其所有的方法，把有特定需求的方法重新实现
     * 和适配者模式的区别是：
     * 适配者中新旧类直接最多是组合关系，而装饰者新旧之间是继承关系
     */
}
