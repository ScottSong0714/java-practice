package day04interface.demo02;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("重写了A方法");
    }

    @Override
    public void methodB() {
        System.out.println("重写了B方法");
    }

    @Override
    public void absMethod() {
        System.out.println("重写了AB接口都有的抽象方法");
    }

    @Override
    public void defMethod() {
        System.out.println("重写了AB接口都有的默认方法");
    }

}
