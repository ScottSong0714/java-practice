package day03abstract.demo01;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    @Override
    public void see() {
        super.see();
        System.out.println("看美女洗澡");
    }

}
