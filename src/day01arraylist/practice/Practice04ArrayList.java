package day01arraylist.practice;

import java.util.ArrayList;
import java.util.Random;

/**
 * 用一个大集合存放20个随机数字，然后筛选其中的偶数元素，放入小集合当中。
 * 要求：使用自定义方法来实现。
 */
public class Practice04ArrayList {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100)+0);
        }
        arrayListEvenNumbers(list);

    }

    public static void arrayListEvenNumbers(ArrayList arrayList) {

        int sum = 0;
        ArrayList<Integer> newArrayList1 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            int num = (int) arrayList.get(i);
            if(num%2 == 0) {
                newArrayList1.add(num);
                sum++;
            }
        }
        System.out.println("原集合数组是：" + arrayList);
        System.out.println("新的集合数组是：" + newArrayList1);
        System.out.println("一共有" + sum + "个偶数");

    }

}
