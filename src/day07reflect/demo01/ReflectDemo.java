package com.day07reflect.demo01;

import com.day07reflect.domain.Person;

public class ReflectDemo {

    /**
    获取Class对象的三种方式：
        1、Class.forName("全类名")：将字节码文件加载进内存，返回class对象
        2、类名.class：通过类名的属性class获取
        3、对象.getClass()：getClass()方法在Object类中定义着
     */
    public static void main(String[] args) throws ClassNotFoundException {

        //1、Class.forName("全类名")
        //多用于配置文件，将类名定义在配置文件中。读取文件，加载类。
        Class cls1 = Class.forName("com.day07reflect.domain.Person");
        System.out.println(cls1);

        //2、类名.class
        //多用于参数传递。
        Class cls2 = com.day07reflect.domain.Person.class;
        System.out.println(cls2);

        //3、对象.getClass()
        //多用于对象的获取字节码的方式
        com.day07reflect.domain.Person person = new Person();
        Class cls3 = person.getClass();
        System.out.println(cls3);

        //比较对象
        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);

        //结论：
        //同一个字节码文件(*.class)在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的Class只有对象都是同一个。

    }

}
