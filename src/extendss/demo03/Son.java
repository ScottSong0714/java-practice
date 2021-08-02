package extendss.demo03;

public class Son extends Dad{

    String str = "子类成员变量";

    /**
     * 重写方法时：
     * 1、返回值范围：父类 > 子类
     * 2、权限范围：父类 < 子类
     */
    @Override
    public void function() {
        System.out.println("子类");
    }

    void method() {
        String str = "子类局部变量";
        System.out.println(str);
        System.out.println(this.str);
        System.out.println(super.str);
    }

}
