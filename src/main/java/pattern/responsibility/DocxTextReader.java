package pattern.responsibility;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.*;

/**
 * @author : Lin Can
 * @description : 解析docx文件的阅读器
 * @modified ：By
 * @date : 2018/5/16 21:13
 */
public class DocxTextReader extends TextReader {
    /**
     * @author : Lin Can
     * @description : 判断文件后缀是否为docx
     * @dateCreated : 2018/5/16 21:16
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
        return extension.equalsIgnoreCase("docx");
    }*/

    @Override
    public String[] getExtension() {
        return new String[] {"docx"};
    }

    /**
     * @author : Lin Can
     * @description : 解析docx文件
     * @dateCreated : 2018/5/16 21:30
     * @Param file
     * @Return :
     */
    @Override
    public String read(File file) {
        try(InputStream inputStream = new FileInputStream(file);
            XWPFDocument xwpfDocument = new XWPFDocument(inputStream);
            XWPFWordExtractor xwpfWordExtractor = new XWPFWordExtractor(xwpfDocument)){
            return xwpfWordExtractor.getText();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
