package headfirst.pattern.adapter.demo.animal;

import org.apache.commons.lang3.StringUtils;

/**
 * @author : Lin Can
 * @date : 2019/2/18 9:48
 */
public class DuckAdapter implements Duck {
    private Turkey turkey;

    public DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public String quack() {
        return turkey.cackle();
    }

    @Override
    public String fly() {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<5; i++) {
            builder.append(turkey.fly());
        }
        return builder.toString();
    }
}
