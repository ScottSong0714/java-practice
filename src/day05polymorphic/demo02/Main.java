package day05polymorphic.demo02;

/**
 * 访问成员变量的两种方式：
 * 1.直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
 * 2.间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。
 *
 * 在多态的代码中，成员方法的访问规则是：
 *     new 的是谁，就优先用谁，没有则向上找。
 *
 * 成员变量：编译看左边，运行看左边；
 * 成员方法：编译看左边，运行看右边。
 */
public class Main {

    public static void main(String[] args) {

        MyInterface obj = new MyInterfaceImpl();

        obj.defMethod();

        //子类（实现类）没有覆盖重写，就是父（接口）：10
        //子类（实现类）若覆盖重写，就是子（实现类）：20
        obj.showNum();

        //编译看左边，运行看右边
        obj.dadMethod();
        obj.defMethod();
        //必须要父类（接口）有的方法，子类（实现类）的方法才能被调用
        //obj.sonMethod();  错误写法

    }

}
