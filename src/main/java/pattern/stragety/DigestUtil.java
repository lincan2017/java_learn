package pattern.stragety;

import org.apache.commons.lang3.StringUtils;

/**
 * @author : Lin Can
 * @description : 进行散列计算的工具类
 * @modified ：By
 * @date : 2018/5/15 8:50
 */
public class DigestUtil {
    private String salt;
    private IDigestStragety iDigestStragety;

    public DigestUtil(String salt, IDigestStragety iDigestStragety) {
        this.salt = salt;
        this.iDigestStragety = iDigestStragety;
    }

    /**
     * @author : Lin Can
     * @description : 计算字符串的hash值
     * @dateCreated : 2018/5/15 8:52
     * @Param value
     * @Return :
     */
    public String calcStrHash(String value) {
        return this.iDigestStragety.digest(value+salt);
    }

    /**
     * @author : Lin Can
     * @description : 判断hash值和数据进行hash计算后的值是否一致
     * @dateCreated : 2018/5/15 8:55
     * @Param hashVal
    * @Param data
     * @Return :
     */
    public boolean checkStrHash (String hashVal,String data) {
        if (StringUtils.isEmpty(hashVal)) {
            return false;
        }
        String correct = this.calcStrHash(data+salt);
        return hashVal.equals(correct);
    }
}
