package com.oop.java;

public class ObjIniMethod {
   String car;
   int num;
   void register(String c,int n){
       car=c;
       num=n;
   }
    public static void main(String[] args) {
        ObjIniMethod oinm = new ObjIniMethod();
        oinm.register("mercedes",2471);
        System.out.println(oinm.car);
        System.out.println(oinm.num);
    }
    }

