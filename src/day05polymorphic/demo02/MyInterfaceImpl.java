package day05polymorphic.demo02;

public class MyInterfaceImpl implements MyInterface{

    int num = 20;

    @Override
    public void defMethod() {
        System.out.println("实现类的默认方法");
    }

    public void sonMethod() {
        System.out.println("实现类特有方法");
    }

    /**
     * 对接口的showNum()方法进行覆盖重写。
     */
    @Override
    public void showNum() {
        System.out.println(num);
    }

}
