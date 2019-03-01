package headfirst.pattern.iterator.support;

import lombok.Data;

/**
 * @author : Lin Can
 * @date : 2019/3/1 9:01
 */
@Data
public class MenuItem {

    private String name;

    private String description;

    private Double price;

    private Boolean vegetarian;

    MenuItem(String name, String description, Double price, Boolean vegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vegetarian=" + vegetarian +
                "}\n";
    }
}
