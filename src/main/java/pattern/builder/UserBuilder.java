package pattern.builder;

/**
 * @author : Lin Can
 * @description : 构造者模式
 * @modified ：By
 * @date : 2018/5/29 8:33
 */
public class UserBuilder {
    private String firstName;     // 必传参数
    private String lastName;      // 必传参数
    private int age;              // 可选参数
    private String phone;         // 可选参数
    private String address;       // 可选参数


    /**
     * @author : Lin Can
     * @description : 该构造函数传入的是必填的属性
     * @dateCreated : 2018/5/29 8:33
     * @Param firstName
    * @Param lastName
     * @Return :
     */
    public UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UserBuilder age (int age) {
        this.age = age;
        return this;
    }

    public int getAge() {
        return age;
    }

    public UserBuilder phone (String phone) {
        this.phone = phone;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserBuilder address (String address) {
        this.address = address;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserPlus build () {
        return new UserPlus(this);
    }
}
