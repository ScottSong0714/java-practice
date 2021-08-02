package day01arraylist.demo;

import java.util.ArrayList;

/**
 * ArrayList常用的方法有：
 * public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致。
 * public E get(int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
 * public E remove(int index)：从集合当中移除元素，参数是索引编号，返回值就是被删除掉的元素。
 * public int size()：获取集合的长度，返回值是集合当中元素的个数。
 */
public class Demo02ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,3);
        System.out.println(arrayList);
        System.out.println("索引位置为1的元素是：" + arrayList.get(1));
        arrayList.remove(2);
        System.out.println("删除掉索引位置为2的集合以及其长度分别是：" + arrayList + "，" + arrayList.size());
    }

}
