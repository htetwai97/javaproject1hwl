package com.java.lessons;

public class IfStatement {

   public static void main(String[] args) {

      boolean ishorny = false;
      boolean hascondom = false;

      if (ishorny == true && hascondom == true ){
          System.out.println("just fuck");
      }else if (ishorny == true || hascondom == true ){
          System.out.println("do depend on your mood and condition");
      }else {
          System.out.println("unavailible to fuck");
      }

      boolean ishot = true;
      boolean hasaircon = false;

      if (ishot == true && hasaircon == true){
          System.out.println("chill with AC");
      }else if (ishot == true || hasaircon == true){
          System.out.println("it is not hot or,take off shirt");
      }else {
          System.out.println("the weather is fine");
      }

      int a = 5;
      int b = ++a;

      // a>b,a<b,a>=b,a<=b,a==b,a!=b
        if (a==b){
            System.out.println("the condition is true");
        }else {
            System.out.println("the condition is wrong");
        }

        int a1 = 5;
        a1 +=2;
        int b1  = a1+2;

        if (a1<b1){
            System.out.println("the condition is true");
        }else {
            System.out.println("the condition is flase");
        }

        boolean israiny = false;
        boolean hasumbrella = false;
        String doing = "take umbrella";
        String doing1 = "go without umbrella or go with raincoat";
        String doing2 = "stay home";

        if (israiny==true&& hasumbrella==true){
            System.out.println(doing);
        }else if (israiny==true|| hasumbrella==true){
            System.out.println(doing1);
        }else {
            System.out.println(doing2);
        }


    }
}