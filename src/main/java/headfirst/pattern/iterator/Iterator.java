package headfirst.pattern.iterator;

/**
 * 迭代器接口
 * @author : Lin Can
 * @date : 2019/3/1 8:55
 */
public interface Iterator {

    /**
     * 集合是否有下一个元素
     * @return boolean
     */
    boolean hasNext();

    /**
     * 获取集合的下一个元素
     * @return Object
     */
    Object next();
}
