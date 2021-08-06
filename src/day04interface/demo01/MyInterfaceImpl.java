package day04interface.demo01;

public class MyInterfaceImpl implements MyInterface {

    @Override
    public void absMethod() {
        System.out.println("实现了抽象方法");
    }

    @Override
    public void defMethod() {
        System.out.println("实现了默认方法（实现类重写）");
    }

}
