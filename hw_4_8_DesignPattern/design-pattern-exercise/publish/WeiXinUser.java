public class WeiXinUser implements observer {

    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.pringln(name + "-" + message);
    }
}