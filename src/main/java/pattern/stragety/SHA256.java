package pattern.stragety;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author : Lin Can
 * @description : 使用SHA进行加密
 * @modified ：By
 * @date : 2018/5/15 8:45
 */
public class SHA256 implements IDigestStragety {
    /**
     * @author : Lin Can
     * @description : 将字符串进行SAH256计算
     * @dateCreated : 2018/5/15 8:45
     * @Param data
     * @Return :
     */
    @Override
    public String digest(String data) {
        return DigestUtils.sha256Hex(data);
    }
}
