package day02extends.demo03;

public class DemoHuawei extends DemoNokia{

    @Override
    public void call() {
        super.call();
        System.out.print("打视频电话，");
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.print("发语音短信，");
        System.out.print("发表情，");
    }

    @Override
    public void show() {
        System.out.print("显示姓名，");
        System.out.print("显示头像，");
        super.show();
    }

}
