package com.test;

/**
 * @Author:taolq
 * @Date: 2022/10/27  14:36
 * @Email 1417126618@qq.com
 */
public class dss {
    public static void main(String[] args) throws Throwable {
        try {
            throw new Throwable("a");
            System.out.println("a");
        } catch (Throwable throwable) {
            throw new Throwable("b");
            System.out.println("b");
        }finally {
            throw new Throwable("c");
            System.out.println("c");
        }
    }
}
