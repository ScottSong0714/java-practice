package day03abstract.practice;

import java.util.Scanner;

/**
 * 群主发红包案例：
 * 1、群主的一笔金额，从群主余额中扣除，平均分成n等份，让成员领取。
 * 2、成员领取完红包后，保存到成员余额中去。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Master master = new Master();
        Member member = new Member();

        System.out.print("请输入要分发的红包金额：");
        double money = sc.nextDouble();
        double masterBalance = master.handOut(money);
        double memberBalance = member.receive(money);
        System.out.println(master.userName() + "一共派发了" + money + "元，"
                + master.userName() + "余额：" + masterBalance + "元，"
                + member.userName() + "余额：" + memberBalance + "元。");

    }

}
