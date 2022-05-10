package com.array.java;

public class CustomcopyArray {
    public static void main(String[] args) {
        //smallest to largest
               /*int numbers[]= {9,8,7,6,5,4,3,2,1};
               int valuenow = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]>numbers[j]){
                    valuenow=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=valuenow;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+"\t");
        }
        System.out.println();
        System.out.println(numbers[numbers.length-1]);
        System.out.println();
        System.out.println(numbers[numbers.length-2]);

        int numbers1[] ={1,3,4,2,8,7,9,6,};
        int copy[] = new int[numbers1.length];//{0,0,0,0,0,0,0,0}


        //before copy
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + "\t");
        }
            System.out.println();


        // copying
        for (int i = 0; i < numbers1.length; i++) {
            copy[i]=numbers1[i];
        }
        System.out.println();


        //after copy
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+"\t");
        }
        System.out.println();


        //largest number search
         int largno = 0;
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i]>largno) {
                largno = numbers1[i];
            }

        }
        System.out.print(largno+"\t");
        System.out.println();*/










        int ages[] = {1,5,51,43,78,99,35,25,67,84};

        /*int ytoe = 0;
        // youngest to elderest
        for (int i = 0; i < ages.length; i++) {
            for (int j = i+1; j < ages.length; j++) {
                if (ages[i]>ages[j]){
                    ytoe=ages[i];
                    ages[i]=ages[j];
                    ages[j]=ytoe;
                }
            }
        }
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i]+"\t");
        }
        System.out.println();

        System.out.println(ages[ages.length-1]);

        System.out.println(ages[ages.length-2]);
        System.out.println();




        //   elderest to youngest
        for (int i = 0; i < ages.length; i++) {
            for (int j = i+1; j < ages.length; j++) {
                if (ages[i]<ages[j]){
                    ytoe=ages[i];
                    ages[i]= ages[j];
                    ages[j]=ytoe;
                }
            }
        }
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i]+"\t");
        }
        System.out.println();

        System.out.println(ages[ages.length-1]);

        System.out.println(ages[ages.length-2]);

        System.out.println();*/


        /*int lifespan[] = new int[ages.length];
        for (int i = 0; i < lifespan.length; i++) {
            System.out.print(lifespan[i]+"\t");
        }
        System.out.println();

        for (int i = 0; i < ages.length; i++) {
            lifespan[i]=ages[i];
        }
        for (int i = 0; i < lifespan.length; i++) {
            System.out.print(lifespan[i]+"\t");
        }
        System.out.println();*/

        int lage = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i]>lage){
                lage=ages[i];
            }
        }
        System.out.println(lage);


    }
}

