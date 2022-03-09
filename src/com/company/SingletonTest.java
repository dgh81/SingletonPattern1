package com.company;

public class SingletonTest {

    public static SingletonTest mySingleton;

    public String getMyData() {
        return myData;
    }

    private String myData;

    private SingletonTest(String myData){
        this.myData = myData;
    }

    public static SingletonTest getInstance(String myData) {
        if (mySingleton == null) {
            mySingleton = new SingletonTest(myData);
        }
        return mySingleton;
    }

}
