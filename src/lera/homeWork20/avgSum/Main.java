package lera.homeWork20.avgSum;

import java.util.Scanner;

public class Main {
    public static void avgSum(float b) {
        float a = 0;
        for (int i = 1; i <= b; i++) {
            a += i;
            //System.out.println(a);
        }
        //System.out.println(a);
        float s = a / b;
        System.out.println("avgSum is = " + s);

    }

    public static void main(String[] args) {

        avgSum(100);

    }
}
