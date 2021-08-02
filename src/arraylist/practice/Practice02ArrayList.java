package arraylist.practice;

import java.util.ArrayList;

/**
 * 自定义四个学生对象，添加到集合并遍历。
 */
public class Practice02ArrayList {

    public static void main(String[] args) {

        ArrayList<Practice02Student> list = new ArrayList<>();
        Practice02Student stu1 = new Practice02Student("刘华强",18,98.5);
        Practice02Student stu2 = new Practice02Student("宋华强",19,100);
        Practice02Student stu3 = new Practice02Student("张华强",21,94.5);
        Practice02Student stu4 = new Practice02Student("范华强",17,97);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            Practice02Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName()
            + "，年龄：" + stu.getAge()
            + "，成绩：" + stu.getScore());
        }

    }

}
