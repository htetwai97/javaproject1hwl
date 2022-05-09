package com.java.lessons;
class Student{

    String name;
    int id;
    int mark;

    public static void main(String[] args) {
        Student one = new Student();//creat object...

        // before initialize --> get default values...
        System.out.println(one.name);
        System.out.println(one.id);
        System.out.println(one.mark);

        // initializing...
        one.name = "htet wai lwin";
        one.id = 00010;
        one.mark = 78;

        //after initializing...
        System.out.println(one.name);
        System.out.println(one.id);
        System.out.println(one.mark);


        ///////////////////////////////////


        Student two = new Student();//creat object...

        // // before initialize --> get default values...
        System.out.println(two.name);
        System.out.println(two.id);
        System.out.println(two.mark);

        // initializing...
        two.name = "thiha zaw";
        two.id = 00011;
        two.mark = 86;

        //aftet initializing...
        System.out.println(two.name);
        System.out.println(two.id);
        System.out.println(two.mark);


    }

}


/////////////////////////////////////////////////


public class ObjInitialize {
    static int no = 343;
    public static void main(String[] args) {
        System.out.println(ObjInitialize.no);
        System.out.println(no);

        Student one1 = new Student();
        System.out.println(one1.name);
        System.out.println(one1.id);
        System.out.println(one1.mark);

        one1.name="kyat pha";
        one1.id = 00021;
        one1.mark = 43;

        System.out.println(one1.name);
        System.out.println(one1.id);
        System.out.println(one1.mark);


        //////////////////////////////


        Student two2 = new Student();
        System.out.println(two2.name);
        System.out.println(two2.id);
        System.out.println(two2.mark);

        two2.name="zaw gyi";
        two2.id = 00023;
        two2.mark = 56;

        System.out.println(two2.name);
        System.out.println(two2.id);
        System.out.println(two2.mark);

        new Student();// annonymous object--> has some advantages...
    }
}
