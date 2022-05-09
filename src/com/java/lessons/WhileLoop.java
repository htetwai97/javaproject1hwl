package com.java.lessons;

public class WhileLoop {
    public static void main(String[] args) {

     int i = 3;
       while (i<39){
           System.out.println(i);
           i=i+3;
       }

        int i1 = 100;
        do {
            System.out.print(i1+ "\t");
            i1-=5;

        }while (i1>=0);

        int a1 = 5;
        while (a1<150) {
            System.out.println(a1);
            a1*=2;
                       }

        int a2 = 120;
        do {
            System.out.println(a2);
            a2-=20;
           }while (a2>=0);

    }
}
