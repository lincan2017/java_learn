package pattern.responsibility;

import java.io.File;

/**
 * @author : Lin Can
 * @description : 阅读器接口
 * @modified ：By
 * @date : 2018/5/16 8:24
 */
public interface ITextReader {
    /**
     * 判断是否能处理这个文件
     * @param file
     * @return
     */
    boolean accept (File file);

    /**
     * 读取文件的内容为字符串
     * @param file
     * @return
     */
    String read(File file);
}
