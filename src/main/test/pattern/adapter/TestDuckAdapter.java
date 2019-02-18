package pattern.adapter;

import headfirst.pattern.adapter.demo.animal.Duck;
import headfirst.pattern.adapter.demo.animal.DuckAdapter;
import headfirst.pattern.adapter.demo.animal.RedTurkey;
import headfirst.pattern.adapter.demo.animal.Turkey;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author : Lin Can
 * @date : 2019/2/18 9:52
 */
public class TestDuckAdapter {
    @Test
    public void testDuckAdapter () {
        Turkey turkey = new RedTurkey();

        Duck duck = new DuckAdapter(turkey);

        Assert.assertEquals(turkey.cackle(),duck.quack());

        Assert.assertEquals(turkey.fly() +
                turkey.fly() +
                turkey.fly() +
                turkey.fly() +
                turkey.fly(),duck.fly());

    }
}
