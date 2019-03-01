package pattern.iterator;

import headfirst.pattern.iterator.Waitress;
import headfirst.pattern.iterator.support.BreakfastMenu;
import headfirst.pattern.iterator.support.LunchMenu;
import headfirst.pattern.iterator.support.MenuItem;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author : Lin Can
 * @date : 2019/3/1 9:28
 */
public class IteratorTest {
    @Test
    public void test() {
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        LunchMenu lunchMenu = new LunchMenu();

        Waitress waitress = new Waitress(breakfastMenu,lunchMenu);

        StringBuilder expected = new StringBuilder("Breakfast\n");
        for (MenuItem menuItem : breakfastMenu.getBreakfastMenus()) {
            expected.append(menuItem.toString());
        }
        expected.append("Lunch\n");
        for (MenuItem menuItem : lunchMenu.getLunchMenus()) {
            if (menuItem != null) {
                expected.append(menuItem.toString());
            }

        }


        Assert.assertEquals(expected.toString(),waitress.printMenu());
    }
}
