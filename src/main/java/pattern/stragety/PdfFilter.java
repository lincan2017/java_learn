package pattern.stragety;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author : Lin Can
 * @description : 压缩文件类型过滤器
 * @modified ：By
 * @date : 2018/5/15 17:31
 */
public class PdfFilter implements FilenameFilter {
    /**
     * @author : Lin Can
     * @description : 判断文件是否是符合pdf格式
     * @dateCreated : 2018/5/15 17:37
     * @Param dir
    * @Param name
     * @Return :
     */
    @Override
    public boolean accept(File dir, String name) {
        //只要满足其中一个条件就是图片
        return isPdf(name);
    }

    /**
     * @author : Lin Can
     * @description : 判断文件名是否是.pdf结尾的
     * @dateCreated : 2018/5/15 17:34
     * @Param name
     * @Return :
     */
    public boolean isPdf (String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        if (name.toUpperCase().endsWith(".PDF")) {
            return true;
        }
        return false;
    }

}
