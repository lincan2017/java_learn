package headfirst.pattern.iterator.support;

import headfirst.pattern.iterator.Iterator;

import java.util.List;

/**
 * @author : Lin Can
 * @date : 2019/3/1 9:19
 */
public class BreakfastMenuIterator implements Iterator {

    private List<MenuItem> breakfastMenus;

    private int index = 0;

    BreakfastMenuIterator(List<MenuItem> breakfastMenus) {
        this.breakfastMenus = breakfastMenus;
    }

    @Override
    public boolean hasNext() {
        return index < breakfastMenus.size();
    }

    @Override
    public Object next() {
        return breakfastMenus.get(index++);
    }
}
