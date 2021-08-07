package day05polymorphic.demo02;

public interface MyInterface{

    public static final int NUM_OF_CLASS = 10;

    public default void defMethod() {
        System.out.println("接口的默认方法");
    }

    public default void dadMethod() {
        System.out.println("接口特有方法");
    }

    default void showNum() {
        System.out.println(NUM_OF_CLASS);
    }

}
