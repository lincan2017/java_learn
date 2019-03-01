package headfirst.pattern.iterator.support;

import headfirst.pattern.iterator.Iterator;
import headfirst.pattern.iterator.Menu;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Lin Can
 * @date : 2019/3/1 8:59
 */

public class BreakfastMenu implements Menu {

    private List<MenuItem> breakfastMenus;

    public BreakfastMenu() {
        breakfastMenus = new ArrayList<>();

        addItem(new MenuItem("红烧土豆", "土豆", 8d, true));
        addItem(new MenuItem("清汤面", "面条", 6d, true));
        addItem(new MenuItem("瘦肉粥", "瘦肉，大米粥", 7d, false));

    }

    private void addItem(MenuItem menuItem) {
        breakfastMenus.add(menuItem);
    }

    public List<MenuItem> getBreakfastMenus() {
        return breakfastMenus;
    }

    @Override
    public Iterator createMenuIterator() {
        return new BreakfastMenuIterator(breakfastMenus);
    }
}
