package day03abstract.practice02;

import java.util.ArrayList;

/**
 * 发红包案例补充。
 */
public class Main {

    public static void main(String[] args) {

        Master master = new Master("群主",100);
        Member member1 = new Member("群成员1",0);
        Member member2 = new Member("群成员2",10);

        System.out.println(master.getName() + "现有" + master.getBalance() + "元。"
                + member1.getName() + "现有" + member1.getBalance() + "元。"
                + member2.getName() + "现有" + member2.getBalance() + "元。");
        ArrayList<Integer> list = master.send(20,2);
        System.out.println(master.getName() + "剩余" + master.show(20) + "元。");
        System.out.println(member1.getName() + "剩余" + member1.receive(list,2) + "元的红包。");
        System.out.println(member2.getName() + "剩余" + member2.receive(list,2) + "元的红包。");

    }

}
