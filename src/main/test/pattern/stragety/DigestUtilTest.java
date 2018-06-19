
package pattern.stragety; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 
/**
    * @author:Lin Can
    * @since:05/15/2018
    * @version 1.0 
*/
public class DigestUtilTest { 

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /** 
    * 
    * Method: calcStrHash(String value) 
    * 
    */ 
    @Test
    public void testCalcStrHash() throws Exception { 
        DigestUtil digestUtil = new DigestUtil("lincan",new MD5DigestStragety());
        String dataHash = digestUtil.calcStrHash("123456");
        System.out.println(dataHash);
    }
    
    /** 
    * 
    * Method: checkStrHash(String hashVal, String data) 
    * 
    */ 
    @Test
    public void testCheckStrHash() throws Exception {
        DigestUtil digestUtil = new DigestUtil("lincan",new MD5DigestStragety());
        assert digestUtil.checkStrHash("94e14541c58ba5dc15eddcd6a0ba6c98","123456") == true;
        assert digestUtil.checkStrHash("00c66aaf5f2c3f49946f151ad2ea0d3","12345") == false;
        assert digestUtil.checkStrHash("","12345") == false;
    } 

    //---------------------------心得---------------------------
    /**
     * 如果直接用if...else去判断hash算法的类型再根据不同的类型进行计算，一旦算法越来越多，则代码就越来越长
     * 抽取成不同的算法都继承统一的接口，即使后期需要加，也只是增加一个子类，之前的代码不需要作修改
     */

} 
