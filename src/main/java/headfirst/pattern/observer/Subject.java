package headfirst.pattern.observer;

/**
 * @author : Lin Can
 * @description : 主题接口
 * @modified ：By
 * @date : 2018/6/28 8:10
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    void registeObserver (Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver (Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver ();
}
