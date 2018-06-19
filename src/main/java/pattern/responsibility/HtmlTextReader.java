package pattern.responsibility;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author : Lin Can
 * @description : html文件阅读器
 * @modified ：By
 * @date : 2018/5/16 20:36
 */
public class HtmlTextReader extends TextReader {

    /**
     * @author : Lin Can
     * @description : 判断文件名后缀是否符合解析标准
     * @dateCreated : 2018/5/16 20:39
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
        return extension.equalsIgnoreCase("html") || extension.equalsIgnoreCase("htm");
    }*/

    @Override
    public String[] getExtension() {
        return new String[]{"html","htm"};
    }

    /**
     * @author : Lin Can
     * @description : 使用jsoup工具包解析html文件，并返回其中的文字
     * @dateCreated : 2018/5/16 20:43
     * @Param file
     * @Return :
     */
    @Override
    public String read(File file) {
        try {
            Document doc = Jsoup.parse(FileUtils.readFileToString(file, "UTF-8"));
            Elements elements = doc.getElementsByTag("td");
            for (Element element :elements) {
                System.out.println(element.ownText().replaceAll("\\r",""));
            }
            return doc.text();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
