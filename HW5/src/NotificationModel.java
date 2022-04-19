public class NotificationModel {
    private String to;
    private String from;
    private String msg;

    // Getters and Setters Here ...

    public NotificationModel(String to, String from, String msg) {
        this.to = to;
        this.from = from;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg +
                " is sent to " +
                to +
                " from " +
                from;
    }
}
