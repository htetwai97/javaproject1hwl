package com.array.java;

public class TwoDArrays {
    public static void main(String[] args) {

        int numbers[][] = {{1, 3, 5, 7, 9, 11, 13, 15, 17},
                {2, 4, 6, 8, 10, 12, 14, 16},
                {11, 13, 15, 17, 19, 21},
                {12, 14, 16, 18, 20},
        };
        System.out.println(numbers.length);
        // numbers[2][3] = 71;
        System.out.println(numbers[2][3]);
        System.out.println(numbers[2].length);

        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.println(numbers[row][column]);
            }
            for (int[] number : numbers) {
                for (int n : number) {
                    System.out.print(n + "\t");
                }


                int datas [][]= new int[3][4];


                int datas1[][]=new int[3][];
                datas1[0]= new int[5];
                datas1[1]= new int[4];
            }
        }


        //fixed column(not valued yet)
        int ages[][] = new int[3][4];

        //flexible column type 1(not valued yet,only structure)
        int ages1[][]= new int[3][];
        ages1[0]= new int[3];
        ages1[1]= new int[5];
        ages1[2]= new int[2];

        //flexible column type 2(valued)
        int ages2[][]= {{1,2,3,4,5},
                {2,3,4,5,6,7,8},
                {3,4,5}
        };
        System.out.print(ages2.length+"\t");
        System.out.println();
        System.out.println(ages2[1].length);
        System.out.println();
        System.out.println(ages2[1][4]);
        System.out.println();

        for (int i = 0; i < ages2.length ; i++) {
            for (int j = 0; j < ages2[i].length; j++) {
                System.out.print(ages2[i][j]+"\t");
            }
        }
        System.out.println();

        for (int ages3[] : ages2 ){
            for (int ages4 : ages3){
                System.out.print(ages4+"\t");
            }
        }








    }
    }







