package com.dfy.pattern.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;


/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/13/22 9:32 AM
 */
public class CoffeeFactory {

    //加载配置文件，获取配置文件中配置的全类名，并创建该类的对象进行存储
    //1. 定义容器对象存储咖啡对象
    private HashMap<String, Coffee> map = new HashMap<>();
    //2. 加载配置文件，只需要加载一次
    static {
        //2.1 创建Properties对象
        Properties p = new Properties();
        //2.2 调用p对象中的load方法进行配置文件的加载
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            //从p集合中获取全类名并创建对象
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Coffee createCoffee(String name) {
        return null;
    }

}
