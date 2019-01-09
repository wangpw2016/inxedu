package com.inxedu.os;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        int[][] ints = {{1,2},{4,5},{7,0,9,8,7,5}};
        int[][] ints1 = new int[3][2];
        System.out.println(Arrays.toString(ints[2]));
        System.out.println(ints[2][1]);
        //System.out.println(ints[2].length);

//        System.out.println("请输入长度");
//        double c = 0.0;
//        double d = 0.0;
//        while(true){
//            double value = getValue();
//            if(value == -1){
//                continue;
//            }else{
//                c = value;
//                break;
//            }
//        }
//        System.out.println(c);
//        System.out.println("请输入宽");
//        while(true){
//            double value = getValue();
//            if(value == -1){
//                continue;
//            }else{
//                d = value;
//                break;
//            }
//        }
//        System.out.println(d);d


    }
    public static double getValue(){
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextDouble()) {
            System.out.println("请正确输入");
            return -1;
        }
        return sc.nextDouble();
    }
}
