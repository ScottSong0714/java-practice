package arraylist.demo;

import java.util.ArrayList;

public class Demo03ArrayListEach {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("刘华强");
        arrayList.add("封华强");
        arrayList.add("宋华强");
        arrayList.add("张华强");
        arrayList.add("李华强");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }

}
