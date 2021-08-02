package day03abstract.demo01;

/**
 * 如何使用抽象方法和抽象类：
 * 1、不能直接创建new抽象类对象。
 * 2、必须用一个子类来继承抽象父类。
 * 3、子类必须覆盖重写抽象父类当中所有的抽象方法。
 * 覆盖重写（实现）：子类去掉abstract关键字，然后补上方法体大括号。
 * 4、创建子类对象进行使用。
 */
public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("猫咪：");
        cat.see();
        cat.eat();

        System.out.println("+---------------------------+");
        System.out.println("旺旺：");
        dog.see();
        dog.eat();

    }

}
