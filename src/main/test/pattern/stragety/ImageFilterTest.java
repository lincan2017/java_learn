
package pattern.stragety; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.io.File;

/**
    * @author:Lin Can
    * @since:05/15/2018
    * @version 1.0 
*/
public class ImageFilterTest { 

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /** 
    * 
    * Method: accept(File dir, String name) 
    * 
    */ 
    @Test
    public void testAccept() throws Exception {
        //需要扫描的目录
        File directory = new File("G:\\个人资料");
        //过滤后的文件
        String[] images = directory.list(new ImageFilter());

        for (String name : images) {
            System.out.println(name);
        }
    } 
    
    /** 
    * 
    * Method: isJpg(String name) 
    * 
    */ 
    @Test
    public void testIsJpg() throws Exception {
        ImageFilter imageFilter = new ImageFilter();
        assert imageFilter.isJpg("a.jpg") == true;
        assert imageFilter.isJpg("a.zip") == false;
    } 
    
    /** 
    * 
    * Method: isPng(String name) 
    * 
    */ 
    @Test
    public void testIsPng() throws Exception {
        ImageFilter imageFilter = new ImageFilter();
        assert imageFilter.isPng("a.png") == true;
        assert imageFilter.isPng("a.zip") == false;
    } 
    

} 
