package com.java.lessons;

// access modifier, non access modifier, return type, method name(parameter), method header{}
public class Methodtype {

    void add(int a,int b){
        System.out.println(a+b);
    }

    static void add1(){
        System.out.println("min may loe kwor , ngr loe kwor");
    }

    public static void main(String[] args) {
        Methodtype method = new Methodtype();
        method.add(1,3);
        method.add(4,6);
        method.add(6,90);

        add1();
        add1();
        add1();
        add1();
    }




}
