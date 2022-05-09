package com.java.lessons;

public class ArraysCopy {
    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,9,8,5,4,7};

        int other[] = new int[5];
        System.arraycopy(numbers,2,other,1,3);
        for (int i = 0; i < other.length; i++) {
            System.out.println(other[i]);

        }
        int another[] = other.clone();
        for (int i = 0; i < another.length; i++) {
            System.out.print(another[i]+"\t");

        }
    }
}
