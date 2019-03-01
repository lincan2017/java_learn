package headfirst.pattern.iterator.support;

import headfirst.pattern.iterator.Iterator;

/**
 * @author : Lin Can
 * @date : 2019/3/1 9:22
 */
public class LunchMenuIterator implements Iterator {
    private MenuItem[] lunchMenus;
    private int index;

    LunchMenuIterator(MenuItem[] lunchMenus) {
        this.lunchMenus = lunchMenus;
    }

    @Override
    public boolean hasNext() {
        return index < lunchMenus.length && lunchMenus[index] != null;
    }

    @Override
    public Object next() {
        return lunchMenus[index++];
    }
}
