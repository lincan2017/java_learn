package pattern.responsibility;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Lin Can
 * @description : 用于读取文件并返回文件中的内容
 * @modified ：By
 * @date : 2018/5/16 9:00
 */
public class FileReader {
    public static List<ITextReader> textReaders = new ArrayList<>();
    /**
     * @author : Lin Can
     * @description : 加载并初始化已有的阅读器
     * @modified ：By
     * @date : 2018/5/16 8:27
     */
    static {
        //读取配置文件中注册的textReader
        try(InputStream inputStream = FileReader.class.getResourceAsStream("readers.txt");){
            //将内容一行一行读出来
            List<String> lines = IOUtils.readLines(inputStream,"UTF-8");
            //每一行就是一个类的全名
            for (String line : lines) {
                //加载每个类
                Class readerClz = Class.forName(line);
                //初始化每个类
                ITextReader textReader = (ITextReader) readerClz.newInstance();
                //将每个类的对象都加入到reader集合中
                textReaders.add(textReader);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * @author : Lin Can
     * @description : 解析传入的文件内容并且返回文件中的内容为字符串
     * @dateCreated : 2018/5/16 9:04
     * @Param file
     * @Return :
     */
    public String readFileToString (File file) {
        if (file == null) {
            return null;
        }
        //变量加载了的阅读器
        for (ITextReader textReader : textReaders) {
            //一个个问过去，如果遇到可以解析的，则返回解析结果
            if (textReader.accept(file)) {
                return textReader.read(file);
            }
        }
        throw new RuntimeException("没有阅读器可解析该文件");
    }
}
