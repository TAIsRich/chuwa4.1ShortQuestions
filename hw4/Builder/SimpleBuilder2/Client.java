package Builder.SimpleBuilder2;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .mainboard("ASUS")
                .memory("Kingston")
                .screen("Samsung")
                .build();
        System.out.println(phone);
    }
}
