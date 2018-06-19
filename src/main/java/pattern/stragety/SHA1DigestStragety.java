package pattern.stragety;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author : Lin Can
 * @description : 使用Sha1进行加密
 * @modified ：By
 * @date : 2018/5/15 8:48
 */
public class SHA1DigestStragety implements IDigestStragety {
    /**
     * @author : Lin Can
     * @description : 将字符串进行Sha1加密
     * @dateCreated : 2018/5/15 8:49
     * @Param data
     * @Return :
     */
    @Override
    public String digest(String data) {
        return DigestUtils.sha1Hex(data);
    }
}
