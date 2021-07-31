package behavior.observerPattern.news.subject;

import behavior.observerPattern.news.observer.Observer;

/**
 * 被觀察對象(Observable/Subject)
 */
public interface Observable {

    /**
     * 註冊Observer(Reader)
     */
    public void register(Observer reader);

    /**
     * 取消註冊Observer(Reader)
     */
    public void unregister(Observer reader);

    /**
     * 通知Observer(Reader)
     */
    public void inform();

}
