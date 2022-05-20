/**
 * Collections 讲的是数据，Stream讲的是计算（CPU）
 * 1. Stream 自己不会存储元素
 * 2. Stream 不会改变源对象，相反，他们会返回一个持有结果的新stream
 * 3. Stream操作是延迟执行的，这意味着他们会等到需要结果的时候才执行。
 * Stream执行流程：
 * 1. 创建Stream： 获取一个数据源
 * 2. 中间操作： 一个操作链： 对数据进行处理
 * 3. 终止操作： 一旦执行中止操作，则会开始执行中间操作链，并产生结果。之后，不会再被使用。
 */

public class StreamApiEndOperation {
    /**
     * 终止操作
     * 一， 匹配与查找
     * 1， allMatch(Predicate p) - 检查是否匹配所有的元素
     * 2， anyMatch(Predicate p) - 检查是否至少匹配一个元素
     * 3， noneMatch(Predicate p) - 检查是否没有匹配的元素
     * 4, findFirst - 返回第一个元素
     * 5， findAny - 返回当前流中的任意元素
     * 6, count - 返回流中元素的个数
     * 7, max(Comparator c) - 返回流中的最大值
     * 8, min(Comparator c) - 返回流中的最小值
     * 9, forEach(Consumer c) - 内部迭代
     *
     * 二，归约
     * 1, reduce(T identity, BinaryOperator) - 可以将流中的元素反复结合起来，得到一个值
     * 2, reduce(BinaryOperator) - 可以将流中的元素反复结合起来，得到一个值
     *
     * 三， 收集
     * 1, collect(Collector c)
     */

    private static final List<Employee> employees = EmployeeData.getEmployees();

    @Test
    public void testMatch() {
        boolean allMatch = employees.stream().allMatch(e -> e.getName().length() > 2);
        System.out.println(allMatch);

        boolean anyMatch = employees.stream().anyMatch(e -> e.getName().length() > 3);
        System.out.println(anyMatch);

        boolean noneMatch = employees.stream().noneMatch(e -> e.getName().startsWith("Li"));
        System.out.println(noneMatch);
    }

    /**
     * findFirst - return first element
     * findAny - return any element
     */
    @Test
    public void testFind() {
        Optional<Employee> employee = employees.stream().findFirst();
        System.out.println(employee);

        Optional<Employee> any = employees.parallelStream().findAny();
        System.out.println(any);
    }

    /**
     * count - return number of elements
     * max(Comparator c) - return max
     * min(Cmparator c - return min
      */
    @Test
    public void testCountMaxMin() {
        long count = employees.stream().filter(e -> e.getAge() > 40).count();
        System.out.println("number of employees (age > 40): " + count);

        
    }


}