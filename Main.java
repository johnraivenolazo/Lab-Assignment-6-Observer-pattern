public class Main {
    public static void main(String[] args) {
        // 1. Create the NewsAgency (Subject)
        NewsAgency agency = new NewsAgency();

        // 2. Create Subscribers (Observers)
        RealSubscriber user1 = new RealSubscriber("Juan");
        RealSubscriber user2 = new RealSubscriber("Maria");
        RealSubscriber user3 = new RealSubscriber("Carlos");

        // 3. Register Subscribers
        agency.subscribe(user1);
        agency.subscribe(user2);

        // 4. Publish News (All subscribed users should get it)
        agency.publishNews("Typhoon warning raised in Metro Manila.");

        // 5. Dynamic Update: Unsubscribe one user and add another
        agency.unsubscribe(user1);
        agency.subscribe(user3);

        // 6. Publish New News (Juan should NOT get it, Carlos SHOULD)
        agency.publishNews("Classes suspended for tomorrow.");
    }
}