package day03abstract.practice;

public class Master extends User{

    @Override
    public String userName() {
        String name = "群主";
        return name;
    }

    public double handOut(double handOut) {
        return (this.balance - handOut);
    }

}
