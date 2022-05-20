
@FunctionalInterface
public interface Foo extends Bar, Baz{
    @Override
    default String defaultCommon() {
        //return Baz.super.defaultCommon();
        String s = "default common from foo";
        System.out.println(s);
        return s;
    }

}