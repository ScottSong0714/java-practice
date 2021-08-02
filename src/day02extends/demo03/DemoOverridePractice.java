package day02extends.demo03;

public class DemoOverridePractice {

    public static void main(String[] args) {

        method();

    }

    public static void method() {

        DemoNokia oldPhone = new DemoNokia();
        DemoHuawei newPhone = new DemoHuawei();

        System.out.println("老诺基亚能：");
        oldPhone.call();
        oldPhone.sendMessage();
        oldPhone.show();

        System.out.println("现在的华为能：");
        newPhone.call();
        newPhone.sendMessage();
        newPhone.show();

    }

}
