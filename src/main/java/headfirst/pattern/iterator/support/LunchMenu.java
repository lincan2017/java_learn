package headfirst.pattern.iterator.support;

import headfirst.pattern.iterator.Iterator;
import headfirst.pattern.iterator.Menu;
import lombok.Data;

/**
 * @author : Lin Can
 * @date : 2019/3/1 9:11
 */
public class LunchMenu implements Menu {

    private MenuItem[] lunchMenus;

    private static final int MAX_LEN = 6;

    private int position = 0;

    public LunchMenu() {
        lunchMenus = new MenuItem[MAX_LEN];

        addItem(new MenuItem("青椒炒牛肉", "青椒，牛肉", 12d, false));
        addItem(new MenuItem("凉拌青瓜", "青瓜", 6d,true));
        addItem(new MenuItem("红烧鱼", "鱼", 12d,false));
    }

    private void addItem(MenuItem menuItem) {
        if (position >= MAX_LEN) {
            throw new RuntimeException("对不起，菜单已满，无法添加");
        }
        lunchMenus[position] = menuItem;
        position ++;
    }

    @Override
    public Iterator createMenuIterator() {
        return new LunchMenuIterator(lunchMenus);
    }

    public MenuItem[] getLunchMenus() {
        return lunchMenus;
    }
}
