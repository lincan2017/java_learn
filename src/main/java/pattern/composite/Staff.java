package pattern.composite;

/**
 * @author : Lin Can
 * @description : 组织成员中的员工类型
 * @modified ：By
 * @date : 2018/5/23 8:25
 */
public class Staff extends OrgItem {

    /**
     * 职位等级
     */
    private String level;

    /**
     * 职位名称
     */
    private String jobName;

    /**
     * 继承自父类的名字
     * @param name
     */
    public Staff(String name) {
        this.setName(name);
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
