# Interview Questions:

## 1. java8 features (functional, lamda, function interface, async, （超级大重点9）

### - **defualt**

### - **Lambda Expressions**

/**
 * Lambda表达式的使用
 *
 * 1. 举例： (o1,o2) -> Integer.compare(o1,o2);
 * 2. 格式：
 *      -> :lambda操作符 或 箭头操作符
 *      ->左边：lambda形参列表 （其实就是接口中的抽象方法的形参列表）
 *      ->右边：lambda体 （其实就是重写的抽象方法的方法体）
 *
 * 3. Lambda表达式的使用：（分为6种情况介绍）
 *
 *    总结：
 *    ->左边：lambda形参列表的参数类型可以省略(类型推断)；如果lambda形参列表只有一个参数，其一对()也可以省略
 *    ->右边：lambda体应该使用一对{}包裹；如果lambda体只有一条执行语句（可能是return语句），省略这一对{}和return关键字
 *
 * 4. Lambda表达式的本质：作为函数式接口的实例
 *
 * 5. 如果一个接口中，只声明了一个抽象方法，则此接口就称为函数式接口。我们可以在一个接口上使用 @FunctionalInterface 注解，
 *   这样做可以检查它是否是一个函数式接口。
 *
 * 6. 所以以前用匿名实现类表示的现在都可以用Lambda表达式来写。

A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

```Java
parameter -> expression
(parameter1, parameter2) -> expression
(parameter1, parameter2) -> { code block }

e.g. Comparator<Integer> com2 = (o1,o2) -> o1.compareTo(o2);
```

### - **Functional Interface**

1. A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. Functional Interface is additionally recognized as **Single Abstract Method Interfaces**. In short, they are also known as **SAM interfaces**. Functional interfaces in Java are the new feature that provides users with the approach of fundamental programming. 

2. lambda expressions can be used to represent the instance of a functional interface.

3. A functional interface can have any number of default methods. *Runnable*, *ActionListener*, *Comparable* are some of the examples of functional interfaces. 

Java SE 8 included four main kinds of functional interfaces which can be applied in multiple situations. These are:

- Consumer<T>       Consumer<T> void accept(T t)
- Predicate<T>      boolean test(T t)
- Function<T, R>    R apply(T t)
- Supplier<T>       T get()

```Java
public void test2(){
        List<String> list = Arrays.asList("北京","南京","天津","东京","西京","普京");

        List<String> filterStrs = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });

        System.out.println(filterStrs);
        List<String> filterStrs1 = filterString(list,s -> s.contains("京"));
        System.out.println(filterStrs1);
    }

    //根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定
    public List<String> filterString(List<String> list, Predicate<String> pre){

        ArrayList<String> filterList = new ArrayList<>();

        for(String s : list){
            if(pre.test(s)){
                filterList.add(s);
            }
        }
        return filterList;
    }

```
```Java
/**
 * 自定义函数式接口
 */
@FunctionalInterface
public interface MyInterface {

    void method1();

//    void method2();
}
```


### - **Method Reference**

/**
 * 方法引用的使用
 *
 * 1.使用情境：当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用！
 *
 * 2.方法引用，本质上就是Lambda表达式，而Lambda表达式作为函数式接口的实例。所以
 *   方法引用，也是函数式接口的实例。
 *
 * 3. 使用格式：  类(或对象) :: 方法名
 *
 * 4. 具体分为如下的三种情况：
 *    情况1     对象 :: 非静态方法
 *    情况2     类 :: 静态方法
 *
 *    情况3     类 :: 非静态方法
 *
 * 5. 方法引用使用的要求：要求接口中的抽象方法的形参列表和返回值类型与方法引用的方法的
 *    形参列表和返回值类型相同！（针对于情况1和情况2）
 *
 * Created by shkstart.
 */


### - **Stream API**

1. Stream关注的是对数据的运算，与CPU打交道
   集合关注的是数据的存储，与内存打交道
 
2. 
  ①Stream 自己不会存储元素。
  ②Stream 不会改变源对象。相反，他们会返回一个持有结果的新Stream。
  ③Stream 操作是延迟执行的。这意味着他们会等到需要结果的时候才执行
 
3. Stream 执行流程
  ① Stream的实例化
  ② 一系列的中间操作（过滤、映射、...)
  ③ 终止操作
 
 4. 说明：
  4.1 一个中间操作链，对数据源的数据进行处理
  4.2 一旦执行终止操作，就执行中间操作链，并产生结果。之后，不会再被使用




## 2. Rest design, url, methods

Representational State Transfer (REST) is an architectural approach to designing web services. REST is an architectural style for building distributed systems based on hypermedia. REST is independent of any underlying protocol and is not necessarily tied to HTTP.



## 3. right view of tree （Leetcode 199)

```Java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int sz = q.size();
            for(int i = 0; i<sz; i++){
                TreeNode cur = q.poll();
                if(i == sz -1) res.add(cur.val);
                if(cur.left !=null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);
            }
        }
        return res;
    }
}
```

# Interview Questions Part2: 

## 1.What is the Springboot?

Spring Boot is an open source Java-based framework used to create a micro Service. It is developed by Pivotal Team and is used to build stand-alone and production ready spring applications. 

## 2.Bean scope in spring （重点9）

When defining a <bean> you have the option of declaring a scope for that bean. For example, to force Spring to produce a new bean instance each time one is needed, you should declare the bean's scope attribute to be prototype. Similarly, if you want Spring to return the same bean instance each time one is needed, you should declare the bean's scope attribute to be singleton.

## 3.What is the singleton pattern? How to implement it? And When to use it? （重点9）

In software engineering, the singleton pattern is a software design pattern that restricts the instantiation of a class to one "single" instance. This is useful when exactly one object is needed to coordinate actions across the system.

```Java
// Eager Instantiation 
// Static initializer based Java implementation of
// singleton design pattern
class Singleton
{
	private static Singleton obj = new Singleton();

	private Singleton() {}

	public static Singleton getInstance()
	{
		return obj;
	}
}

// Double check locking
// Double Checked Locking based Java implementation of
// singleton design pattern
class Singleton
{
	private static volatile Singleton obj = null;

	private Singleton() {}

	public static Singleton getInstance()
	{
		if (obj == null)
		{
			// To make thread safe
			synchronized (Singleton.class)
			{
				// check again as multiple threads
				// can reach above step
				if (obj==null)
					obj = new Singleton();
			}
		}
		return obj;
	}
}


```


## 4. What is the result in the console?

```Java
class Operation{ 

int data;

void change(int data){ 

 data=data+100;//changes will be in the local variable only 

 } 

public static void main(String args[]){ 

Operation op=new Operation(); 

System.out.println("before change "+op.data); 

op.change(500); 

System.out.println("after change "+op.data); 

} 

}
```

before change 0;
after change 0;

this.data=data+100;
before change 0;
after change 600;

5. Given the string, find the maximum number in the this string and return it
Example: ajnfjn100jnvjnf400jnjnjn
output: 400 (edited) 
```Java
public static void main(String[] args) {
        String input = "ajnfjn100jnvjnf400jnjnjn";

        input += " ";

        System.out.println(input);

        int res = Integer.MIN_VALUE;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            while (input.charAt(i) >= '0' && input.charAt(i) <= '9' && i < input.length()) {
                sb.append(input.charAt(i));
                i++;
            }
            // System.out.println(sb.toString());
            if(sb.length() == 0){
                continue;
            }
            String numsString = sb.toString();
            // System.out.print(numsString);
            int number = Integer.parseInt(numsString);
            // 
            // System.out.println(foo);
            sb.delete(0, sb.length());
            res = Math.max(res, number);
        }
        System.out.println("Max number is: " + res);

    }
```
