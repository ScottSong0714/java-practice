package day04interface.demo03;

/**
 * 类与类之间是单继承的，直接父类只有一个。
 * 类与接口之间是多继承的，一个类可以有多个接口。
 * 接口与接口之间是多继承的。
 *
 * 注意事项：
 * 1、多个父接口中的抽象方法如果重复，没关系。
 * 2、多个父接口中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写，且必须带着default关键字。
 */
public class Main {

    public static void main(String[] args) {

        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodA();
        impl.methodB();
        impl.method();
        impl.defMethod();

    }

}
