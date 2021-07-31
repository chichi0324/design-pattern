package behavior.observerPattern.youtube.observer;

import behavior.observerPattern.youtube.subject.Observable;

/**
 * 觀察者(Observer/Listener)
 */
public interface Observer {

    /**
     * 訂閱Observable(News)
     */
    void subscribe(Observable news);

    /**
     * 取消訂閱Obervable(News)
     */
    void unsubscribe();

    /**
     * 給Observable(News)呼叫的方法
     */
    void update();

}
