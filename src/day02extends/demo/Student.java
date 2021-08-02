package day02extends.demo;

public class Student extends Person {

    private String sex;

    public Student() {}

    public Student(String sex) {
        this.sex = sex;
    }

    public Student(String name, int age, double score, String sex) {
        super(name, age, score);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
