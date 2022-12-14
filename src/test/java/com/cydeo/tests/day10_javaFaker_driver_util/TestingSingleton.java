package com.cydeo.tests.day10_javaFaker_driver_util;

import org.testng.annotations.Test;

public class TestingSingleton {

    @Test
    public void singleton_understand_test(){
        String str1 = Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str2);
    }

    @Test
    public void singleton_understand_test2(){
        String str4 = Singleton.getWord();
        System.out.println("str4 = " + str4);
    }
}
