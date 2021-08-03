package day03abstract.practice;

public class Member extends User{
    @Override
    public String userName() {
        String name = "群员";
        return name;
    }

    public double receive(double receive) {
        return (this.balance + receive);
    }

}
