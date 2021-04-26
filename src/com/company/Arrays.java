package com.company;

import java.util.Random;

public class Arrays {
    public int [] creatRandom(){
        int array [] = new int[100];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
            System.out.println(array[i]);
        }
        return array ;

    }
}
