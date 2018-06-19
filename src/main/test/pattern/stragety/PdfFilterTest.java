
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
public class PdfFilterTest { 

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
        File dir = new File("G:\\个人资料");
        String[] pdfs = dir.list(new PdfFilter());
        for (String name : pdfs) {
            System.out.println(name);
        }
    } 
    
    /** 
    * 
    * Method: isPdf(String name) 
    * 
    */ 
    @Test
    public void testIsPdf() throws Exception { 
        //TODO: Test goes here... 
    } 
    

} 
