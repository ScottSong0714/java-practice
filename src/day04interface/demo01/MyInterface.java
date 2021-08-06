package day04interface.demo01;

public interface MyInterface {

    //接口中的抽象方法
    public abstract void absMethod();

    //在Java8中，接口允许定义默认方法。
    public default void defMethod() {
        System.out.println("实现了默认方法（接口中）");
    }

    //在Java8中，接口允许定义静态方法。
    public static void staMehtod() {
        System.out.println("实现了静态方法（接口中）");
    }

    //接口中可以定义常量
    public static final int NUM_OF_MY_CLASS = 3;

}
