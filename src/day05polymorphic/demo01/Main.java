package day05polymorphic.demo01;

/**
 * 代码当中体现多态性：父类引用指向子类对象。
 *
 * 格式：
 * 父类名称 对象名 = new 子类名称();
 * 接口名称 对象名 = new 实现类名称();
 */
public class Main {

    public static void main(String[] args) {

        Dad obj = new Son();

        obj.method();
        obj.dadMethod();

    }

}
