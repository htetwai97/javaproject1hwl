package com.java.lessons;

public class SwitchStatement {
    public static void main(String[] args) {

       String day ="saturday and sunday";
        String str = "is weekday";
        switch (day){
            case "monday":
                System.out.println(day +    str);
                break;
            case "tuesday":
                System.out.println(day +   str);
                break;
            case "wednesday":
                System.out.println(day +    str);
                break;
            case "thursday":
                System.out.println(day +    str);
                break;
            case "friday":
                System.out.println(day  +    str);
                break;
            default:
                System.out.println(day +  "  is weekend");

        }
        int direction = 5;
        switch (direction){
            case 1:
                System.out.println("it is east");
                break;
            case 2:
                System.out.println("it is west");
                break;
            case 3:
                System.out.println("it is south");
                break;
            case 4:
                System.out.println("it is north");
                break;
            default:
                System.out.println("there is no direction");
        }
        String name = "min aung hlaing";
        String job = " is a businessman";
        switch (name){
            case "elon musk":
                System.out.println(name+  job);
                break;
            case "markzukerberg":
                System.out.println(name+  job);
                break;
            case "jet ma" :
                System.out.println(name+  job);
                break;
            case "billgate":
                System.out.println(name+ job);
                break;
            default:
                System.out.println(name+    "  is an shit");
        }

        String name1 = "phat lone ma";
        String role = "  is a whore";
        switch (name1){
            case "phat lone ma":
                System.out.println(name1 + role);
                break;
            case "model ma":
                System.out.println(name1 + role);
                break;
            case "gym kg ma":
                System.out.println(name1 + role);
                break;
            default:
                System.out.println(name1 + "  is my love");

        }




    }
}
