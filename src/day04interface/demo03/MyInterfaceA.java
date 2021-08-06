package day04interface.demo03;

public interface MyInterfaceA {

    void methodA();

    void method();

    default void defMethod() {
        System.out.println("AAA");
    }

}
