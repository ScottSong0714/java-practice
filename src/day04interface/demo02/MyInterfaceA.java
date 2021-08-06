package day04interface.demo02;

public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void absMethod();

    public default void defMethod() {}

}
