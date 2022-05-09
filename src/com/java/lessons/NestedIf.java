package com.java.lessons;

public class NestedIf {
    public static void main(String[] args) {
       int kids = 0;
       if (kids<5){
           switch (kids){
               case 1:
                   System.out.println("only one is always not enough");
                   break;
               case 2:
                   System.out.println("two is better than one");
                   break;
               case 3:
                   System.out.println("three is good build for a family");
                   break;
               case 4:
                   System.out.println("four is a lucky even number and can help in pairs");
                   break;
               default:
                   System.out.println("no kid is not even a family");
           }
       }else {
           System.out.println("too many kids for a house");
       }
        System.out.println();



        int age = 20;
        if (age>=18)
        {
            System.out.println("you can go to strip club and drink");
            if (age>=21){
                System.out.println("you can fuck some girls");
            }else {
                System.out.println("you cannot fuck some girls");
            }
        }else {
            System.out.println("you cannot go to strip club");
        }
        System.out.println();



        int score = 100;
        if (score>=40)
        {
            System.out.println("pass");
            if (score>=80){
                System.out.println("distintion");
            }else {
                System.out.println("not distintion");
            }
        }else {
            System.out.println("fail");
        }
        }
    }

