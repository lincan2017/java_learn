package headfirst.day2.subject;

import headfirst.day2.observer.Observer;

/**
 * 主题接口
 * @author : Lin Can
 * @date : 2018/12/7 21:25
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer 注册的观察者
     */
    void registerObserver (Observer observer);

    /**
     * 移除观察者
     * @param observer 取关的观察者
     */
    void removeObserver (Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObversers ();
}
