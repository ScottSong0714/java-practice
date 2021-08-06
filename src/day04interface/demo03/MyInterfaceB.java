package day04interface.demo03;

public interface MyInterfaceB {

    void methodB();

    void method();

    default void defMethod() {
        System.out.println("BBB");
    }

}
