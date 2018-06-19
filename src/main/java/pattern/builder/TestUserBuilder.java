package pattern.builder;

/**
 * @author : Lin Can
 * @description : 测试构造器模式
 * @modified ：By
 * @date : 2018/5/29 8:40
 */
public class TestUserBuilder {
    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder("Berry","Alan").age(18).phone("102390213039");
        UserPlus user = userBuilder.build();
        System.out.println(user);
    }
    /**
     * 这样子用一个构造器的方式，代替真正的实体，可以保证该对象一旦存在，就是合法的
     * 可以把校验的内容用在builder中，这样子即使有临时不合法的对象，也是一个builder对象
     * 使用了链式编程，返回值都是一个builder对象，可以直接调用下一个方法
     */
}
