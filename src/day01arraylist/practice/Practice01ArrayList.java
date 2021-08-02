package day01arraylist.practice;

import java.util.ArrayList;
import java.util.Random;

/**
 * 生成6个1-33之间的随机整数，添加到集合并遍历集合。
 */
public class Practice01ArrayList {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list.add(random.nextInt(33)+1);
        }

        System.out.println(list);

    }

}
