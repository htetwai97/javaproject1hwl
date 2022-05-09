package com.java.lessons;

public class JavaArrays {
    public static void main(String[] args) {


        /*String[] playerlist = {"Ronaldo", "Messi", "Dmaria", "Kaka", "Zidane", "Maradona"};

        System.out.println(playerlist.length);

        playerlist[5] = "Naymer";

        System.out.println(playerlist[5]);

        for (String player : playerlist) {
            System.out.println(player);
        }

        for (String p : playerlist) {
            System.out.println(p);
        }

        for (int i1 = 0; i1 < playerlist.length; i1++) {
            System.out.print(playerlist[i1] + "\t");
        }
        System.out.println();

        for (int i2 = playerlist.length - 1; i2 >= 0; i2--) {
            System.out.print(playerlist[i2] + "\t");

        }


        String[] playerlist2 = new String[5];
        playerlist2[0] = "messi";
        playerlist2[1] = "poba";
        playerlist2[2] = "chamberlin";
        playerlist2[4] = "macguire";
        System.out.println(playerlist2.length);
         System.out.println(playerlist2[4]);

        for (int i = 2; i < playerlist2.length; i++) {
            System.out.print(playerlist2[i] + "\t");
        }*/



        //arrays combines with forloop,while loop,if,switch

        /*String[] whores = {"chu chu","model ma","gym trainer girl","dick nose","mwa mwa lay"};
        System.out.println(whores.length);
        whores[0] = "hsu yadanar ";
        System.out.println(whores[0]);
        System.out.println();
        for (int i = 0; i < whores.length; i++) {
            System.out.println(whores[i]);
        }
        System.out.println();
        for (String hoes: whores){
            System.out.println(hoes);
        }*/

        String[] whorelist1 = new String[4];
        whorelist1[0]="hsu yadanar ";
        whorelist1[1]="model ma ";
        whorelist1[3]="gym girl";

        for (int i = 0; i < whorelist1.length; i++) {
            System.out.print(whorelist1[i]+"\t");
        }
        System.out.println();

        for (int i = whorelist1.length-1; i >=0; i--){
            System.out.print(whorelist1[i]+"\t");
        }
        System.out.println();

        for (String hoeslist1 : whorelist1){
            System.out.print(hoeslist1+"\t");
        }
        System.out.println();


        int [] ages = new int[5];
        ages[0]=23;
        ages[1]=43;
        ages[2]=50;
        ages[4]=35;

        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i]+"\t");
        }
        System.out.println();

        for (int lifespan : ages ){
            System.out.print(lifespan+"\t");
        }





    }
}



