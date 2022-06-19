package com.lz.observer;

/***
 * 主题
 *
 */
public interface Subject {
    /***
     * 注册观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /***
     * 移除观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /***
     * 当状态发生改变，通知所有观察者
     */
    public void notifyObserver();
}
