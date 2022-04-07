package com.java.tyurin;

import com.epam.gradle.task.StringUtils;


public class Utils {
    public static void hello (){
        System.out.println("zbs");
    }

    public static boolean isPos (String ss) {
        return StringUtils.isPositiveNumber("7");
    }

    public static boolean isAllPositiveNumbers (String... str){
        for (String s:str) {
            if(!StringUtils.isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }
}
