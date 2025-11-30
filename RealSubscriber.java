public class RealSubscriber implements Subscriber {
    private String name;

    public RealSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
    
    // Helper to get name (optional, useful for UI/Logging)
    public String getName() {
        return name;
    }
}