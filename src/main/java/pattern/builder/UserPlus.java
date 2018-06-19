package pattern.builder;

/**
 * @author : Lin Can
 * @description : 构造者模式
 * @modified ：By
 * @date : 2018/5/29 8:32
 */
public class UserPlus {
    private String firstName;     // 必传参数
    private String lastName;      // 必传参数
    private int age;              // 可选参数
    private String phone;         // 可选参数
    private String address;       // 可选参数

    public UserPlus(UserBuilder userBuilder) {
        this.firstName = userBuilder.getFirstName();
        this.lastName = userBuilder.getLastName();
        this.address = userBuilder.getAddress();
        this.age = userBuilder.getAge();
        this.phone = userBuilder.getPhone();
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

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
                + ", address=" + address + "]";
    }
}
