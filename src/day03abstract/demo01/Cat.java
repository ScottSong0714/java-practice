package day03abstract.demo01;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    @Override
    public void see() {
        super.see();
    }

}
