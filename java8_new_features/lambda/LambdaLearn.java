
public class LambdaLearn {
/**
 *
 * https://www.baeldung.com/java-8-lambda-expressions-tips
 *
 * 1， 只能有一个方法。可以有多个default方法（因为default方法被实现了）
 * 2， Avoid Overloading Methods With Functional Interfaces as Parameters， 如果有overloading, 可以用Cast
 *
 * By using the @FunctionalInterface annotation, the compiler will trigger an error in response to any attempt to
 * break the predefined structure of a functional interface. It is also a very handy tool to make our application
 * architecture easier to understand for other developers.
 */

    @Test
    public void overrideFoo() {
        //Foo fooByIc = newFoo();
        Foo fooByIC = new Foo() {
            @Override
            public String method (String string ) {
                return string + " from foo";
            }
        };

        String hello = fooByIC.method("hello");
    }

    @Test
    public void labmdaFoo() {
        Foo foo = parameter -> parameter + " from Foo";
        String hello = hello.method("hello");
        System.out.println(hello);
    }

    /**
     * To solve this problem, we have two options. The first option is to use methods with different names:
     * String processWithCallable(Callable<String> c) throws Exception;
     * String processWithSupplier(Supplier<String> s);
     * @throws Exception
     */
    @Test
    public void testOverload() throws Exception {
        Processor processor = new ProcessorImpl();
        //String result = processor.process(() -> "abc");
        //String result = processor.process((Callable<String>) () -> "abc")
    }

    /**
     * Use "Effectively Final" variables
     *  当variable只赋值一次，没有任何变动的时候，Java默认是final。
     */
    @Test
    public void testFinal() {
        String localVariable = "Local";
        Foo foo = parameter -> {
            return parameter + " " + localVariable;
        }

        System.out.println(foo.mehotd("hello"));
    }

    /**
     * change object will results in errors
     */
    @Test
    public void testFinal2() {
        String localVariable = "Local";
        localVariable = "LOCAL";

        Foo foo = parameter -> {
            //return parameter + " " + localVariable;
            return parameter;
        }

        System.out.println(foo.method("hello"));
    }

    /**
     * Object: set method is ok
     */
    @Test
    public void testFinal3() {
        List<Employee> employees = EmployeeData.getEmployees();
        Employee employee = employees.get(0);
        employee.setAge(55);

        Foo foo = parameter -> {
            return parameter + " " + employee;
        };

        System.out.println(foo.method("hello"));
    }



}