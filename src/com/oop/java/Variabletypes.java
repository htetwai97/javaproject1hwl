package com.oop.java;

public class Variabletypes {

    int age = 25;
    int kids = 5;
    static int mark = 91;
    String name = "htet wai lwin";


    public static void main(String[] args) {
        //local variable --> direct access,declare within method
        //global variable--> 1.static  --> direct access, memory alloted only once, declare using static keyword
        //                    2.instance --> access through object,declare within class

        System.out.println(Variabletypes.mark);


        Variabletypes object1 = new Variabletypes();
        System.out.println(object1.age);
        System.out.println(object1.kids);


    }
}
