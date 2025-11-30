public interface Subject {
    // Methods to register and unregister observers
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    
    // Method to notify all observers of a change
    void notifySubscribers();
}