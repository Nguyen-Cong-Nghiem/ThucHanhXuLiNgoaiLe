package TestNgoaiDungClassArray;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] array() {
        Integer mang [] = new Integer[100];
        Random rd = new Random();
        System.out.println("Mangla:");
        for (int i=0; i < mang.length; i++) {
            mang[i]= rd.nextInt(1000);
            System.out.println(mang[i]);
        }
        return mang;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample= new ArrayExample();
        Integer[] mang = arrayExample.array();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long dien vao chi so bat ki:");
        int x = sc.nextInt();
        try{
            System.out.println("Gia tri chi so thu  " + x + " la:" + mang[x]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Chi so vuot qua mang!");

        }
    }
}
