package oop1;

import java.util.Random;

public class main2 {
    public static void main(String[] args){

        System.out.println("Three Random values from one to 1000");
        Random r2= new Random(1000);
        for (int i = 0;i< 3;i++){
            System.out.println(r2.nextInt(1001));
        }
    }
}
