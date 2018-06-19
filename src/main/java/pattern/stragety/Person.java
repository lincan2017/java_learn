package pattern.stragety;

/**
 * @author : Lin Can
 * @description : 用于测试策略模式的第二个应用，比较器
 * @modified ：By
 * @date : 2018/5/15 17:18
 */
public class Person {
    private int id;
    private String name;
    private int age;
    private int height;


    public Person(int id, String name, int age, int height) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + ", height=" + height + "]";
    }
}
