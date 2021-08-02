package day01arraylist.demo;

import java.util.ArrayList;

/**
 * 若希望向集合ArrayList当中存储基本数据类型，必须使用基本类型对应的“包装类”
 * 包装类（引用类型，包装类都位于java.lang包下）
 * byte -> Byte
 * short -> Short
 * int -> Integer
 * long -> Long
 * float -> Float
 * double -> Double
 * char -> Charactor
 * boolean -> Boolean
 */
public class Demo04ArrayListBasic {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        System.out.println(list);

    }

}
