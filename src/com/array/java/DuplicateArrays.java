package com.array.java;

public class DuplicateArrays {
    public static void main(String[] args) {

  int numbers[] = {1,2,3,4,5,6,7,8,9,9,};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]==numbers[j]){
                    System.out.print(numbers[i]+"\t");
                }
            }
        }
        System.out.println();

         int numbers1 []= {1,2,3,3,34,4,4,5,5,6,7,8,9};
        for (int i1 = 0; i1 < numbers1.length; i1++) {
            for (int j1 = i1+1; j1 <numbers1.length ; j1++) {
                if (numbers1[i1]==numbers1[j1]){
                    System.out.print(numbers1[j1]+"\t");
                }
            }
        }
        System.out.println();

        int ages [] = {11,25,8,5,4,8,6,4,11};
        for (int i = 0; i < ages.length; i++) {
            for (int j = i+1; j < ages.length ; j++) {
                if (ages[i]==ages[j]){
                    System.out.print(ages[i]+"\t");
                }
            }
        }
        System.out.println();
        System.out.println(ages.length);



    }
}
