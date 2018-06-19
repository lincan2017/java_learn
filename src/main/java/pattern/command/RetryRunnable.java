package pattern.command;

/**
 * @author : Lin Can
 * @description : 自定义一个重新尝试的线程接口
 * @modified ：By
 * @date : 2018/5/14 8:40
 */
public interface RetryRunnable{
    void run() throws Exception;
}
