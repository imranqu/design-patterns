package com.system.design.lld;

public class ConnectionPool {
    //Step 3
    private static  ConnectionPool instance = null; // Eager initialization - slow startup

    private ConnectionPool(){
    //Step - 1 : Create a private constructor
    }


    public static ConnectionPool getInstance(){
        //Step - 2 : Create a public static method
        if(instance == null){
            //Step 4
            synchronized (ConnectionPool.class) {
                if (instance == null) {
                    instance = new ConnectionPool();
                }
            }

        }

        return instance;
    }



}
