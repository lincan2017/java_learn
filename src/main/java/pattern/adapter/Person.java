package pattern.adapter;

/**
 * @author : Lin Can
 * @description : 该类定义用于对应适配器模式的新类
 * @modified ：By
 * @date : 2018/5/18 8:46
 */
public class Person {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名：" + this.getName() + "，年龄：" + this.getAge();
    }
}
