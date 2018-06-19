
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
public class TxtTextReaderTest { 

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /** 
    * 
    * Method: accept(File file) 
    * 
    */ 
    @Test
    public void testAccept() throws Exception {
        TxtTextReader txtTextReader = new TxtTextReader();
        assert txtTextReader.accept(new File("E:\\a\\1.txt")) == true;
        assert txtTextReader.accept(new File("E:/a/1.xml")) == false;
    } 
    
    /** 
    * 
    * Method: read(File file) 
    * 
    */ 
    @Test
    public void testRead() throws Exception { 
        TxtTextReader txtTextReader = new TxtTextReader();
        System.out.println(txtTextReader.read(new File("E:/A/1.txt")));
    } 
    

} 
