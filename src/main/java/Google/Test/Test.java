/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google.Test;

import java.util.Scanner;

/**
 *
 * @author mehdi
 */
public class Test {
        NewClass n = new NewClass();
    public static void main(String[] args) {
        int i = 1;
                double p = 7/3.0;
        System.out.println(""+ String.format("2.66666","#.###"));

//        Gson g = new Gson();

        for (int j = 0; j < 10; j++) {
            System.out.print("  "+NewClass.arr[i]);
        }
    Scanner in = new Scanner(System.in);
    
       String s = in.next();
        switch (s) {
            case "mehdi":
                System.out.println("1");
                break;
            case "ali":
                System.out.println("2");
                break;
            case "reza":
                System.out.println("3");
                break;
            default:
                System.out.println("0");
        }
    }
    private static void add(int x, int y){ 
        System.out.println(x+y);
    }
    
}
