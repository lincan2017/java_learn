package pattern.stragety;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author : Lin Can
 * @description : 图片过滤器
 * @modified ：By
 * @date : 2018/5/15 17:31
 */
public class ImageFilter implements FilenameFilter {
    /**
     * @author : Lin Can
     * @description : 判断文件是否符合图片格式
     * @dateCreated : 2018/5/15 17:37
     * @Param dir
    * @Param name
     * @Return :
     */
    @Override
    public boolean accept(File dir, String name) {
        //只要满足其中一个条件就是图片
        return isJpg(name) || isPng(name);
    }

    /**
     * @author : Lin Can
     * @description : 判断文件名是否是.jpg结尾的
     * @dateCreated : 2018/5/15 17:34
     * @Param name
     * @Return :
     */
    public boolean isJpg (String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        if (name.toUpperCase().endsWith(".JPG")) {
            return true;
        }
        return false;
    }

    /**
     * @author : Lin Can
     * @description : 判断文件名是否是png结尾的
     * @dateCreated : 2018/5/15 17:36
     * @Param name
     * @Return :
     */
    public boolean isPng (String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        if (name.toUpperCase().endsWith(".PNG")) {
            return true;
        }
        return false;
    }
}
