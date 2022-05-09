package com.java.lessons;

public class ReturnType {
    /////////

    int sum(int num1,int num2){
        return num1+num2;
    }
    int multiply(int num1,int num2){
        return num1*num2;
    }
    String name(String first,String second){
        return first+second;
    }

    ////////////

    void ages(int age1,int age2){
        System.out.println(age1+age2);
    }
    static void ages1 (int life1,int life2){
        System.out.println(life1+life2);
    }


    //////////

    public static void main(String[] args) {
        ReturnType rt1 = new ReturnType();

        int sum = rt1.sum(5,8);
        int multiple = rt1.multiply(5,8);
        String str = rt1.name("htet ","wai ");

        ////////

        System.out.println(sum);
        System.out.println(multiple);
        System.out.println("my name is "+str);
        rt1.ages(45,56);
        ReturnType.ages1(66,77);





    }
}
