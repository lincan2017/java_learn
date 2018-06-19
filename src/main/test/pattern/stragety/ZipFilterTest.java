
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
public class ZipFilterTest { 

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
        File direcory = new File("G:\\个人资料");
        String[] zips = direcory.list(new ZipFilter());
        for (String name : zips) {
            System.out.println(name);
        }
    } 
    
    /** 
    * 
    * Method: isZip(String name) 
    * 
    */ 
    @Test
    public void testIsZip() throws Exception { 
        //TODO: Test goes here... 
    } 
    
    /** 
    * 
    * Method: isRar(String name) 
    * 
    */ 
    @Test
    public void testIsRar() throws Exception { 
        //TODO: Test goes here... 
    } 
    

} 
