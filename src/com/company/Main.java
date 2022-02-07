package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       //көбөйтүү таблицасы
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
//            }
//            System.out.println();
//        }

        //3-суроо
        //Колдонуучуга оң бүтүн санды киргизүүнү сунуштаган программаны жазыңыз.
        // Андан кийин ал ошол сандын көбөйтүү таблицасын басып чыгарышы керек.
//      Scanner scanner = new Scanner(System.in);
//      int butunSan = scanner.nextInt();
//      int koboytuu ;
//        for (int i = 1; i <= 10; i++) {
//          koboytuu = butunSan * i;
//                  System.out.println(butunSan + " x "+ i + " "+ " = "+ koboytuu);
//
//        }
        //4-суроо
       // Клавиатура аркылуу киргизилген каалаган сандын фактордук маанисин табуу программасын жаз.
       int[] a = new int[]{23, 56, 87, 987, 999, 3};
    }


    static void metod(){
        System.out.println("Kaalagan sanynyzdy berip , 10 go cheyinki jadybalyn korunz");
        Scanner scanner = new Scanner(System.in);
        int san = scanner.nextInt();
        int koboituu;
        for (int i = 1; i <= 10; i++) {
        koboituu = san * i ;
            System.out.println( san+ " * " + i +" = " +koboituu);
        }
    }

    static void method(String name){
        System.out.println("Salam"+ name);
    }

   static void max(int[] a){
        int summma = a[0];
       for (int i = 0; i < a.length; i++) {
           if (a[i] >= summma) {
               summma = a[i];
           }
       }
       System.out.println(summma);

   }
   static void  min(int[] a) {
        int kichinesi = a[0] ;
       for (int i = 0; i < a.length; i++) {
           if (a[i] <= kichinesi){
            kichinesi = a[i]   ;
           }
       }
       System.out.println(kichinesi);
   }









}

