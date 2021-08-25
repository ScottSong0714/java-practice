package day06junit.test;

import day06junit.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator c = new Calculator();

    /**
     * 初始化方法：
     * 用于资源申请，所有测试方法在执行之前都会执行该方法。
     */
    @Before
    public void init() {
        System.out.println("init...");
    }

    /**
     * 释放资源方法：
     * 在所有测试方法执行完后，都会自动执行该方法。
     */
    @After
    public void close() {
        System.out.println("close...");
    }

    /**
     * 测试加法的方法。
     */
    @Test
    public void addTest() {
        Assert.assertEquals(3, c.add(1, 2));
    }

    /**
     * 测试减法的方法。
     */
    @Test
    public void subTest() {
        Assert.assertEquals(1, c.sub(2, 1));
    }

}
