package day04interface.demo03;

public class MyInterfaceImpl implements MyInterface {

    @Override
    public void methodA() {
        System.out.println("实现了接口A中的方法");
    }

    @Override
    public void methodB() {
        System.out.println("实现了接口B中的方法");
    }

    @Override
    public void method() {
        System.out.println("实现了接口AB共有的方法");
    }

}
