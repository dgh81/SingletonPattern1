package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SingletonTest test = SingletonTest.getInstance("daniel");
        System.out.println(test.getMyData());

        // test2 peger på test, malene bliver ikke sat, da SingletonTest allerede er instancieret.
        SingletonTest test2 = SingletonTest.getInstance("malene");
        System.out.println(test2.getMyData());
    }
}
