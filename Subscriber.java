public interface Subscriber {
    // Method called by the Subject to update the observer
    void update(String news);
}