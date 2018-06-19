package pattern.composite;

/**
 * @author : Lin Can
 * @description : 组织成员的抽象类，成员可以是一个单位也可以是一个人
 * @modified ：By
 * @date : 2018/5/23 8:22
 */
public abstract class OrgItem {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
