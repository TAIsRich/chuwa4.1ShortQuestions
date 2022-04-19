public class Main {
    public static void main(String[] args) {
        Notification smsNotification =
                new NotificationFactory().createNotification(NotificationType.SMS);
        Notification emailNotification =
                new NotificationFactory().createNotification(NotificationType.EMAIL);
        Notification pushNotification =
                new NotificationFactory().createNotification(NotificationType.PUSH);

        smsNotification.sendNotification();
        emailNotification.sendNotification();
        pushNotification.sendNotification();
    }
}
