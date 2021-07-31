package behavior.observerPattern.youtube;

import behavior.observerPattern.youtube.observer.Reader;
import behavior.observerPattern.youtube.subject.News;

public class YoutubeTest {

    public static void main(String[] args) {

        News news = new News(); // 建立一個新聞(Observable)

        Reader john = new Reader("Matt"); // 建立一些讀者
        Reader mary = new Reader("John");
        Reader bill = new Reader("Lisa");

        // 每個讀者訂閱新聞
        // Observer(Reader)訂閱Observable(News)
        john.subscribe(news); //訂閱新聞
        mary.subscribe(news);
        bill.subscribe(news);

        news.setLatestNews(true); // 更新Observble(News)的狀態
    }

}
