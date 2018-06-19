package pattern.responsibility;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;

/**
 * @author : Lin Can
 * @description :
 * @modified ：By
 * @date : 2018/5/16 22:09
 */
public abstract class TextReader implements ITextReader {

    /**
     * @author : Lin Can
     * @description : 判断该阅读器能否处理该文件
     * @dateCreated : 2018/5/16 22:18
     * @Param file
     * @Return :
     */
    @Override
    public boolean accept(File file) {
        if (file == null) {
            return false;
        }
        String ext = FilenameUtils.getExtension(file.getName());
        if (StringUtils.isEmpty(ext)) {
            return false;
        }
        String[] extensions = getExtension();
        for (String extenstion : extensions) {
            if (ext.equalsIgnoreCase(extenstion)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获取每个阅读器可以处理的后缀的集合
     * @return
     */
    public abstract String[] getExtension();

}
