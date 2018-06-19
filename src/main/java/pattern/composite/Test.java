package pattern.composite;

/**
 * @author : Lin Can
 * @description : 测试组合模式
 * @modified ：By
 * @date : 2018/5/23 8:39
 */
public class Test {
    public static void main(String[] args) {
        OrgUnit orgGroup = new OrgUnit("如鹏集团");

        OrgUnit orgUSA = new OrgUnit("如鹏美国");
        OrgUnit orgChina = new OrgUnit("如鹏中国");
        orgGroup.addChild(orgChina);
        orgGroup.addChild(orgUSA);

        OrgUnit orgGZ = new OrgUnit("如鹏广州");
        OrgUnit orgBJ = new OrgUnit("如鹏北京");
        orgChina.addChild(orgBJ);
        orgChina.addChild(orgGZ);

        Staff weiFF = new Staff("卫飞飞");
        OrgUnit orgBJYF = new OrgUnit("如鹏北京研发中心");
        OrgUnit orgBJTeach = new OrgUnit("北京如鹏教学中心");
        orgBJ.addChild(weiFF);
        orgBJ.addChild(orgBJTeach);
        orgBJ.addChild(orgBJYF);

        OrgUnit orgJava = new OrgUnit("如鹏java研发中心");
        OrgUnit orgData = new OrgUnit("如鹏数据分析中心");
        orgBJYF.addChild(orgData);
        orgBJYF.addChild(orgJava);

        Staff mrGao = new Staff("高斯林");
        mrGao.setJobName("java初级工程师");
        mrGao.setLevel("p6");
        Staff mrBill = new Staff("比尔盖茨");
        mrBill.setLevel("p5");
        mrBill.setJobName("java高级工程师");
        orgJava.addChild(mrBill);
        orgJava.addChild(mrGao);

        Staff mrZhang = new Staff("张小龙");
        mrZhang.setJobName("产品经理");
        mrZhang.setLevel("P9");
        Staff mrMa = new Staff("马化腾");
        mrMa.setJobName("C++工程师");
        mrMa.setLevel("P5");
        orgGZ.addChild(mrZhang);
        orgGZ.addChild(mrMa);

        print(orgGroup,0);
    }

    /**
     * 返回由count个Tab键组成的字符串
     * @param count
     * @return
     */
    static String repeatTab(int count)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<count;i++)
        {
            sb.append("\t");
        }
        return sb.toString();
    }

    /**
     * @author : Lin Can
     * @description : 编写打印遍历节点信息的方法，采用递归：
     * @dateCreated : 2018/5/23 8:56
     * @Param orgItem
    * @Param depth
     * @Return :
     */
    static void print(OrgItem orgItem,int depth) {
        if (orgItem instanceof Staff) {
            Staff staff = (Staff) orgItem;
            System.out.println(repeatTab(depth)+" 员工："+staff.getName()+" 岗位："+staff.getJobName()+" 级别："+staff.getLevel());
        } else if (orgItem instanceof OrgUnit) {
            OrgUnit orgUnit = (OrgUnit) orgItem;
            System.out.println(repeatTab(depth)+" 组织单位："+orgUnit.getName());
            for (OrgItem child : orgUnit.getChildren()){
                print(child,depth+1);
            }
        }
    }

    /**
     * 组合模式适用于树节点结构的处理
     * 因为树状结构有容器和叶子节点，如果处理时要判断是叶子还是容器，则会产生很长的代码和重复代码
     * 这样子调用者可以一致对待容器和节点
     * 而实现的底层是通过递归
     */
}
