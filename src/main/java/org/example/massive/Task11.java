package org.example.massive;

import java.util.Arrays;

public class Task11{
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[] result = add(arr, 9, 3);
    System.out.println(Arrays.toString(result));
    }
    public static int[] add(int[] arr, int x, int pos) {
    int[] newArr = new int[arr.length + 1];
    System.arraycopy(arr, 0, newArr, 0, pos);
    newArr[pos] = x;
    System.arraycopy(arr, pos, newArr, pos + 1, arr.length - pos);

    return newArr;
    }
}

/* public class Task11 {
    public static void main (String[] arg){
        String[] moons = {"Luna", "Phobos", "Deimos"};
        byte b = 0;
        do while (b< moons.length)
        System.out.println(b++);
        while (b < moons.length);
    }
}
    */
    /* 
public class Task11{
    public static void main(String[] arg){
        for (int row = 3; row > 0; row --){
            int column = row;
            while (column <= 3){
                System.out.println(column);
                column++;
            }
            System.out.println();
        }
    }
}
*/
/* public class Task11{
    public static void main(String[] arg){
        int [] age = {20,30, 40, 50, 60};
        for (int i = 0; i < age.length; i++){
            System.out.println(age[i] + " ");
            if (age[i] == 40) {
                continue;
            }
            System.out.println("Processed");
            break;
        }
    }
}
*/
/*
public class Task11{
    static void m(int i){

    }
    public static void main (String[] args){
        int a = 18;
        m(a);
    }
}
*/
/* 
public class Task11{
    public static void main(String[] arg){
String s1 = "Hello world!";
String s2 = "Hello world!";
String s3 = "Hello" + " world!";
String s4 = new String("Hello world!");
String s5 = new String(new char[]{'H', 'e', 'l', 'l','w', 'o', 'r', 'l', 'd', '!'});
String s6 = new String(s3);
String s7 = new String(s3).intern();
System.out.println(s1 == s2);
System.out.println(s1 == s3);
System.out.println(s1 == s4);
System.out.println(s1 == s5);
System.out.println(s1 == s6);
System.out.println(s1 == s7);
}
}
*/
/*
public class Task11{
    public static void main(String[] arg){
        for (int kk=0; kk< 4; kk++){
            System.out.println("kk = " + kk + ", ");
            kk = kk +1;
        }
        System.out.println("kk = " + kk + ", ");
    }

}
*/
/* 
public class Task11{
    public static void main(String[] arg){
        int a = 3;
        switch (a) {
            case 1:
                System.out.println("a");
            case 2:
                System.out.println("b");
            case 3:
                System.out.println("c");
            case 4:
                System.out.println("d");
            case 5:
                System.out.println("error");    
        }

    }

}
*/