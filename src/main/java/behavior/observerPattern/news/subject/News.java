package behavior.observerPattern.news.subject;

import behavior.observerPattern.news.observer.Observer;

import java.util.ArrayList;
 
/**
 * News實作Observable介面，為被觀察對象：
 *
 * 成員變數readerList中記錄了所有的訂閱讀者，任一讀者只要訂閱了新聞，即會被加入readerList。
 * 成員變數latestNews代表News的狀態，若為true表示最新，反之為舊的新聞。setLatestNews()被呼叫時會更改News的狀態，進而執行inform()方法去通知讀者名單readerList中的所有讀者。
 * 註冊方法regsiter()，當讀者訂閱新聞時，該讀者會被加入讀者名單readerList。
 * 取消註冊方法unregister()，當讀者取消訂閱時，該讀者會從讀者名單readerList中移除。
 * 通知方法inform()，在News的狀態更動時，會被呼叫來通知並更新所有的讀者。
 */
public class News implements Observable {

    private ArrayList<Observer> readerList = new ArrayList<Observer>(); // 紀錄已註冊的Readers
    private boolean latestNews = true; // News的狀態

    public boolean isLatestNews() {
        return latestNews;
    }

    /**
     * 設定News狀態
     */
    public void setLatestNews(boolean latestNews) {
        this.latestNews = latestNews;
        inform();
    }

    /**
     * 註冊Reader
     */
    @Override
    public void register(Observer reader) {
        readerList.add(reader);
    }

    /**
     * 取消註冊Reader
     */
    @Override
    public void unregister(Observer reader) {
        readerList.remove(reader);
    }

    /**
     * 通知全部的Reader
     */
    @Override
    public void inform() {
        for(Observer reader : readerList){
            reader.update();
        }
    }

}
