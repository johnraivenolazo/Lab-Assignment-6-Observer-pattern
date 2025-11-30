import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private List<Subscriber> subscribers;
    private String latestNews;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("New subscriber added.");
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Subscriber removed.");
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }

    // Method to trigger the update
    public void publishNews(String news) {
        this.latestNews = news;
        System.out.println("\nBREAKING NEWS: " + news);
        notifySubscribers();
    }
}