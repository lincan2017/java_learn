package pattern.command;

/**
 * @author : Lin Can
 * @description : 命令模式的应用一
 * @modified ：By
 * @date : 2018/5/14 8:36
 */
public class Retry {

    /**
     * @author : Lin Can
     * @description : 重复执行某个操作n次的方法
     * @dateCreated : 2018/5/14 8:45
     * @Param maxTime 重试的次数
    * @Param retryRunnable 执行的操作
     * @Return :
     */
    public static boolean execute(int maxTime,RetryRunnable retryRunnable) {
        for (int i=0;i<maxTime;i++){
            try {
                retryRunnable.run();
                return true;
            } catch (Exception e) {
                System.out.println("执行第"+(i+1)+"次出错。");
            }
        }
        return false;
    }
}
