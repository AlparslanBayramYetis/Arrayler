package Arrayler;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyveSort {
    public static int[] arrayi_doldur(int sayi){
        Scanner input = new Scanner(System.in);
        int[] cikti = new int[sayi];

        for (int i = 0; i < sayi; i++) {
            cikti[i]=input.nextInt();

        }

        return cikti;
    }

    public static void array_yazdir(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i]);
        }
    }
    public static void array_max(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("En büyük sayi : "+ max);
    }
    public static void array_sort(int[] array){
        Arrays.sort(array);
        array_yazdir(array);
    }

    public static void main(String[] args) {
        int[] a = arrayi_doldur(5);
        array_yazdir(a);
        array_max(a);
        array_sort(a);

        int [] b = {1,2,3,4,5};
        int [] c = {1,2,3,4,5};

        if (Arrays.equals(c,b)){ //Arraylerin içini kıyaslamayı sağlar
            System.out.println("Eşitler");
        }

    }
}
