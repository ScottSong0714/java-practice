package day04interface.demo01;

public class Main {

    public static void main(String[] args) {

        MyInterfaceImpl impl = new MyInterfaceImpl();

        impl.absMethod();
        impl.defMethod();

        //注意：不能通过接口实现类的对象调用接口中静态方法。
        //直接通过接口调用其中的静态方法。
        //接口名称.静态方法();
        MyInterface.staMehtod();

        System.out.println(MyInterface.NUM_OF_MY_CLASS);

    }

}

