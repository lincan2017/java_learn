
package pattern.responsibility; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.io.File;

/**
    * @author:Lin Can
    * @since:05/16/2018
    * @version 1.0 
*/
public class FileReaderTest { 

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /** 
    * 
    * Method: readFileToString(File file) 
    * 
    */ 
    @Test
    public void testReadFileToString() throws Exception { 
        FileReader fileReader = new FileReader();
        File file = new File("d://User//Desktop//view-source_www.rupeng.com_Courses_Index_88.html");/*
        File file1 = new File("E:/a/1.html");
        File file2 = new File("E:/a/1.doc");
        File file3 = new File("E:/a/1.docx");
        System.out.println(fileReader.readFileToString(file));
        System.out.println(fileReader.readFileToString(file3));
        System.out.println(fileReader.readFileToString(file1).substring(0,40));
        System.out.println(fileReader.readFileToString(file2));*/
        System.out.println(fileReader.readFileToString(file));
    } 

    //---------------------心得---------------------------
    /**
     * 用责任链模式，可以使调用者和处理者进行解耦
     * 调用者不需要知道谁能处理
     * 只要一个个问过去，谁能处理就给他处理即可
     * 像上面的测试类，所有的file都用同一个方法处理，无须判断具体用什么阅读器解析
     */
} 
