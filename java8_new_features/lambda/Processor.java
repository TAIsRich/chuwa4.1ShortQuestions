
public interface Processor {
    String process(Callable<String> c) throws Exception;
    String process(Supplier<String> s);
}