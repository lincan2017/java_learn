package pattern.stragety;

/**
 * @author : Lin Can
 * @description : 散列算法的接口
 * @modified ：By
 * @date : 2018/5/15 8:39
 */
public interface IDigestStragety {
    /**
     * 将字符串进行散列运算
     * @param data
     * @return
     */
    String digest(String data);
}
