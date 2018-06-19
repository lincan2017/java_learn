package pattern.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : Lin Can
 * @description : 组织成员中的单位
 * @modified ：By
 * @date : 2018/5/23 8:30
 */
public class OrgUnit extends OrgItem{

    private List<OrgItem> orgItemList = new LinkedList<>();

    public OrgUnit(String name) {
        this.setName(name);
    }

    /**
     * @author : Lin Can
     * @description : 添加子成员
     * @dateCreated : 2018/5/23 8:35
     * @Param orgItem
     * @Return :
     */
    public void addChild (OrgItem orgItem) {
        orgItemList.add(orgItem);
    }

    /**
     * @author : Lin Can
     * @description : 删除子成员
     * @dateCreated : 2018/5/23 8:37
     * @Param orgItem
     * @Return :
     */
    public void removeChild (OrgItem orgItem) {
        orgItemList.remove(orgItem);
    }

    /**
     * @author : Lin Can
     * @description : 获取该节点下的所有子成员
     * @dateCreated : 2018/5/23 8:38
     * @Param
     * @Return :
     */
    public OrgItem[] getChildren () {
        return orgItemList.toArray(new OrgItem[orgItemList.size()]);
    }
}
