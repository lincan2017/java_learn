package pattern.responsibility;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author : Lin Can
 * @description : txt文件阅读器
 * @modified ：By
 * @date : 2018/5/16 8:46
 */
public class TxtTextReader extends TextReader {

    /**
     * @author : Lin Can
     * @description : 通过后最判断是否能可解析
     * @dateCreated : 2018/5/16 8:47
     * @Param file
     * @Return :
     */
    /*@Override
    public boolean accept(File file) {
        if (file == null) {
            return false;
        }
        //获取文件的拓展名
        String extension = FilenameUtils.getExtension(file.getName());
        if (StringUtils.isEmpty(extension)) {
            return false;
        }
        return extension.equalsIgnoreCase("txt");
    }*/

    @Override
    public String[] getExtension() {
        return new String[] {"txt"};
    }

    /**
     * @author : Lin Can
     * @description : 将文件的内容读取为字符串
     * @dateCreated : 2018/5/16 8:52
     * @Param file
     * @Return :
     */
    @Override
    public String read(File file) {
        try {
            return FileUtils.readFileToString(file,"UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
