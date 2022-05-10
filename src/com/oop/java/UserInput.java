package com.oop.java;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
       /* System.out.print("Enter your age ");
        Scanner userinput = new Scanner(System.in);
        int age = userinput.nextInt();
        if (age >25 && age <= 40) {
            System.out.println("your age is good for working");
        } else if (age <=25) {
            System.out.println("enjoy the youth life");
        }else {
            System.out.println("you are fucking old, go die");
        }*/


        ///////


        System.out.print("Enter password ");
        Scanner userinput1 = new Scanner(System.in);
        String password = userinput1.nextLine();
        if (password.equals("legend")){
            System.out.println(password.equals("legend"));
            System.out.println("you are logged in");
    }else {
            System.out.println(password.equals("legend"));
            System.out.println("try again later");
        }
}
}
