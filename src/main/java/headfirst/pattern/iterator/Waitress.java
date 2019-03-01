package headfirst.pattern.iterator;

import headfirst.pattern.iterator.support.MenuItem;

/**
 * @author : Lin Can
 * @date : 2019/3/1 9:30
 */
public class Waitress {
    private Menu breakfast;
    private Menu lunch;

    public Waitress(Menu breakfast, Menu lunch) {
        this.breakfast = breakfast;
        this.lunch = lunch;
    }

    public String printMenu() {
        String print = "";
        print += "Breakfast\n";
        print += printMenu(breakfast.createMenuIterator());
        print += "Lunch\n";
        print += printMenu(lunch.createMenuIterator());
        return print;
    }

    private String printMenu(Iterator iterator) {
        StringBuilder menuItemStr = new StringBuilder();
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            menuItemStr.append(menuItem.toString());
        }

        return menuItemStr.toString();
    }

}
