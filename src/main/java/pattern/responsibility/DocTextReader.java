package pattern.responsibility;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;

import java.io.*;

/**
 * @author : Lin Can
 * @description : 解析Doc文件的阅读器
 * @modified ：By
 * @date : 2018/5/16 21:01
 */
public class DocTextReader extends TextReader {

    /**
     * @author : Lin Can
     * @description : 判断文件的后缀是否是doc
     * @dateCreated : 2018/5/16 21:04
     * @Param file
     * @Return :
     */
    /*@Override
    public boolean accept(File file) {
        if (file == null) {
            return false;
        }
        String extension = FilenameUtils.getExtension(file.getName());
        if (StringUtils.isEmpty(extension)) {
            return false;
        }
        return extension.equalsIgnoreCase("doc");
    }*/

    @Override
    public String[] getExtension() {
        return new String[] {"doc"};
    }

    /**
     * @author : Lin Can
     * @description : 调用HWPDocument的方法解析doc文件的文字
     * @dateCreated : 2018/5/16 21:10
     * @Param file
     * @Return :
     */
    @Override
    public String read(File file) {
        try(InputStream inputStream = new FileInputStream(file);
            HWPFDocument hwpfDocument = new HWPFDocument(inputStream)) {
            Range range = hwpfDocument.getRange();
            String str = range.text();
            return str;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
