
package pattern.template; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 
/**
    * @author:Lin Can
    * @since:05/12/2018
    * @version 1.0 
*/
public class DBReaderImplTest { 

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /** 
    * 
    * Method: createConnection() 
    * 
    */ 
    @Test
    public void testCreateConnection() throws Exception { 
        //TODO: Test goes here... 
    } 
    
    /** 
    * 
    * Method: processResultSet(ResultSet resultSet) 
    * 
    */ 
    @Test
    public void testProcessResultSet() throws Exception { 
        DBReader dbReader = new DBReaderImpl();
        dbReader.executeSQL("select * from user");
    }

    //-------------------------心得--------------------------
    /**
     * 通过多态的方式，将公共部分抽出作为父类，其他地方挖空由子类实现。
     * 这就是模板方法，可以减少代码的重复并且对修改关闭，拓展开放
     * 在连接数据库的时候，不同的数据库所需要的驱动不同，所以连接方法由子类实现
     * 在处理结果的时候，由于需求不同，所以不同的处理也由子类实现
     * 其他的获得连接后到和数据库交互部分是一致的所以可以在父类中实现。
     */

} 
