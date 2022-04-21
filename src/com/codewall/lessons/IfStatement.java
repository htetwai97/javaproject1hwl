package com.codewall.lessons;

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

    }
}