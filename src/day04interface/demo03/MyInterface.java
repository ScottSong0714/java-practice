package day04interface.demo03;

public interface MyInterface extends MyInterfaceA, MyInterfaceB{

    @Override
    default void defMethod() {
        MyInterfaceB.super.defMethod();
        MyInterfaceA.super.defMethod();
    }

}
