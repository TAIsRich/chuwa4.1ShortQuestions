
@FunctionalInterface
public interface Bar{
    String method(String string);
    default String defaultBar() {
        String s = "default Bar method";
        System.out.println(s);
        return s;
    }

    default String defaultCommon() {
        String s = "default common from Bar";
        System.out.println(s);
        return s;
    }

}