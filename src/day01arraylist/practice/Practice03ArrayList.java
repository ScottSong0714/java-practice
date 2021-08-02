package day01arraylist.practice;

import java.util.ArrayList;

/**
 * 定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}扩起集合，
 * 使用@分隔每个元素。格式参照{元素@元素@元素}
 */
public class Practice03ArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Scott");
        list.add("Amy");
        arrayListPrint(list);

    }

    public static void arrayListPrint(ArrayList<String> arrayList) {
        System.out.print("{");
        for (int i = 0; i < arrayList.size(); i++) {
            if(i == arrayList.size()-1)
                System.out.print(arrayList.get(i));
            else
                System.out.print(arrayList.get(i) + "@");
        }
        System.out.println("}");
    }

}
