package day03abstract.practice02;

import java.util.ArrayList;

public class Master extends User {

    public Master() {
    }

    public Master(String name, int balance) {
        super(name, balance);
    }

    /**
     * 用来发送红包的函数。
     * @param sendMoney
     * @param count
     * @return
     */
    public ArrayList<Integer> send(int sendMoney, int count) {
        ArrayList<Integer> list = new ArrayList<>();

        //判断发送金额和余额是否一致。
        if(sendMoney > getBalance()) {
            System.out.println("您的余额不足。");
            return list;
        }

        int money = sendMoney/count;
        int extraMoney = sendMoney%count;
        for (int i = 0; i < count; i++) {
            if(i == count - 1) {
                list.add(extraMoney+money);
            } else {
                list.add(money);
            }
        }
        return list;
    }

    /**
     * 展示群主的余额的函数。
     * @param sendMoney
     * @return
     */
    public int show(int sendMoney) {
        int balance = getBalance() - sendMoney;
        setBalance(balance);
        return getBalance();
    }

}
