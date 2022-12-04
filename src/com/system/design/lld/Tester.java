package com.system.design.lld;

import com.system.design.lld.creational.ConnectionPool;

public class Tester {

    public static void main(String[] args) {
        ConnectionPool ins = ConnectionPool.getInstance();
        System.out.println("instance 1 "+ins);

        ConnectionPool insTwo = ConnectionPool.getInstance();
        System.out.println("instance 1 "+insTwo);


    }
}
