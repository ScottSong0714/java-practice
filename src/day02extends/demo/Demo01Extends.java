package day02extends.demo;

import java.util.Scanner;

public class Demo01Extends {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        System.out.print("请输入学生姓名：");
        stu.setName(sc.next());
        System.out.print("请输入学生年龄：");
        stu.setAge(sc.nextInt());
        System.out.print("请输入学生成绩：");
        stu.setScore(sc.nextDouble());
        System.out.print("请输入学生性别：");
        stu.setSex(sc.next());

        System.out.println(stu.getName() + "," + stu.getAge() + ","
        + stu.getScore() + "," + stu.getSex() + ",");

    }

}
