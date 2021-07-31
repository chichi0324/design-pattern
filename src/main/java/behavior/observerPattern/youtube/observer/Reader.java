package behavior.observerPattern.youtube.observer;

import behavior.observerPattern.youtube.subject.News;
import behavior.observerPattern.youtube.subject.Observable;

/**
 * Reader實作Observer介面，為觀察者
 *
 * 更新方法update()，當News的狀態更新時，News會藉由此方法通知Reader。
 * 訂閱方法subscribe()，用來訂閱News。訂閱後則此讀者會被新聞註冊。
 * 取消訂閱方法unsubscribe()，用來取消訂閱News，取消訂閱後則此讀者會被新聞取消註冊。
 * 閱讀方法read()，依照News的狀態來閱讀新聞。
 */
public class Reader implements Observer {

    private String name = null;     // 讀者的名稱
    private Observable news = null; // 訂閱的News

    public Reader(String name){
        this.name = name;
    }

    /**
     * 訂閱News
     */
    @Override
    public void subscribe(Observable news) {
        this.news = news;
        news.register(this); // News註冊此Reader
    }

    /**
     * 取消訂閱News
     */
    @Override
    public void unsubscribe() {
        news.unregister(this); // News取消註冊此Reader
    }

    /**
     * Observer(News)的更新通知
     */
    @Override
    public void update() {
        read(); // 當Reader被News通知時會執行read()
    }

    private void read(){
        if(((News) this.news).isLatestNews()){ // 檢查新聞的狀態
            System.out.println(name + " read latest news");
        } else {
            System.out.println(name + " read old news");
        }
    }

}
