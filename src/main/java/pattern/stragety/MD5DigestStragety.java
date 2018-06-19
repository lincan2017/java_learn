package pattern.stragety;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author : Lin Can
 * @description : MD5散列算法
 * @modified ：By
 * @date : 2018/5/15 8:41
 */
public class MD5DigestStragety implements IDigestStragety {
    /**
     * @author : Lin Can
     * @description : 使用工具类对字符串进行MD5编码
     * @dateCreated : 2018/5/15 8:43
     * @Param data
     * @Return : 返回MD5算法后的字符串
     */
    @Override
    public String digest(String data) {
        return DigestUtils.md5Hex(data);
    }
}
