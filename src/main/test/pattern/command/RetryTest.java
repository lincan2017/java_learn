
package pattern.command;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.net.URI;

/**
    * @author:Lin Can
    * @since:05/14/2018
    * @version 1.0 
*/
public class RetryTest { 

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /** 
    * 
    * Method: execute(int maxTime, RetryRunnable retryRunnable) 
    * 
    */ 
    @Test
    public void testExecute() throws Exception {
        //定义要执行的操作
       RetryRunnable retryRunnable = new RetryRunnable() {
           @Override
           public void run() throws Exception {
               URI uri = new URI("http://www.baidu.com");
               String str = IOUtils.toString(uri,"utf-8");
               System.out.println(str.substring(0,50));
           }
       };
       //尝试重复执行操作3次
       boolean retryResult = Retry.execute(3,retryRunnable);
       System.out.println("执行的结果为"+retryResult);
    }

    //---------------------心得---------------------------------------
    /**
     * 定义需要执行的操作（即命令）在另外一个地方
     * 定义什么时候做，做多少次在另外一个地方
     * 命令可以拓展
     * 什么时候做和做多少次不需要修改
     * 对修改关闭，对拓展开放
     */


} 
