package pattern.builder;

/**
 * @author : Lin Can
 * @description : 未使用构造者模式前
 * @modified ：By
 * @date : 2018/5/29 8:29
 */
public class User {
    private String firstName;     // 必传参数
    private String lastName;      // 必传参数
    private int age;              // 可选参数
    private String phone;         // 可选参数
    private String address;       // 可选参数


    public User(String firstName, String lastName, int age, String phone, String address) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }

    /**
     * 未使用构造者模式前，需要不同组合的构造方法
     * 如果不适用构造方法，在set的时候会产生短时间的不合法的对象
     */
}
