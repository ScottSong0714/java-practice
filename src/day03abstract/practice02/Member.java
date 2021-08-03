package day03abstract.practice02;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    public Member() {
    }

    public Member(String name, int balance) {
        super(name, balance);
    }

    public int receive(ArrayList<Integer> list, int count) {
        Random random = new Random();
        int balance = getBalance() + list.get(random.nextInt(count-1)+0);
        setBalance(balance);
        return balance;
    }

}
