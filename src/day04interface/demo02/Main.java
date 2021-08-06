package day04interface.demo02;

public class Main {

    public static void main(String[] args) {

        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodA();
        impl.methodB();
        impl.absMethod();
        impl.defMethod();

        Son son = new Son();
        son.method();

    }

}
