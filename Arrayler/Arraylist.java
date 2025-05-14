package Arrayler;

import java.util.ArrayList;

public class Arraylist {
    public static void yazdir (ArrayList<String> a){
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();

        arraylist.add("A");
        arraylist.add("B");
        arraylist.add("C");
        arraylist.add("D");
        yazdir(arraylist);
        System.out.println("*********************");

        // System.out.println(arraylist.get(0));
        // arraylist.remove(0);
        // arraylist.remove("B");

        /*
        System.out.println(arraylist.indexOf("A")); //İlk gördüğü yerde duruyor sonrakileri görmez
        System.out.println(arraylist.lastIndexOf("B"));//sondan başlayarak tarıyor
        System.out.println(arraylist.indexOf("E"));//Aradığımız değer olmayıncada -1 değerini döndürür
        */

        arraylist.set(2,"E");

        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
        System.out.println("****************************");
        yazdir(arraylist);

    }

}
