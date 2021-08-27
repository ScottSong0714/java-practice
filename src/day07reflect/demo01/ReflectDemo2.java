package com.day07reflect.demo01;

import com.day07reflect.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {

    /**
     * Class对象功能：
     * 1、获取成员变量
     *  Field[] getFields()
     *  Field getField(String name)
     *  Field[] getDeclaredFields()
     *  Field getDeclaredField(String name)
     * 2、获取构造方法
     *  Constructor<?>[] getConstructors()
     *  Constructor<T> getConstructor(类<?>... parameterTypes)
     *  Constructor<?>[] getDeclaredConstructors()
     *  Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     * 3、获取成员方法
     *  Method[] getMethods()
     *  Method getMethod(String name, 类<?>... parameterTypes)
     *  Method[] getDeclaredMethods()
     *  Method getDeclaredMethod(String name, 类<?>... parameterTypes)
     * 4、获取类名
     *  String getName()
     */
    public static void main(String[] args) throws Exception {

        //0、获取Person的Class对象
        Class personClass = Person.class;
        Person person = new Person();

        /* 获取成员变量
           Field[] getFields()
           Field getField(String name)
           Field[] getDeclaredFields()
           Field getDeclaredField(String name)
         */
        //1、Field[] getFields()：获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("---------------------------");

        //2、Field getField()：获取指定public修饰的成员变量
        Field field = personClass.getField("a");
        //获取成员变量的值
        field.set(person, "张三");//设置
        Object obj = field.get(person);//获取
        System.out.println(obj);

        System.out.println("===========================");

        //3、Field[] getDeclaredFields()：获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field DeclaredField : declaredFields) {
            System.out.println(declaredFields);
        }

        System.out.println("--------------------------");

        //4、Field getDeclaredField(String name)：获取指定的成员变量，不考虑修饰符
        Field declaredField = personClass.getDeclaredField("name");
        //忽略访问权限修饰符的安全检查（暴力反射）
        declaredField.setAccessible(true);
        declaredField.set(person, "李四");
        System.out.println(declaredField.get(person));

        //Field:成员变量
        //1、设置值
        //void set(Object obj, Object value)
        //2、获取值
        //*.get(Object obj)
        //3、忽略访问权限修饰符的安全检查（暴力反射）
        //*.setAccessible(true)

    }

}
