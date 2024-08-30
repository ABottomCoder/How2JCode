package Basics.chapter6;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {11, 12, 13, 14, 15};
        // copy
        int[] c = Arrays.copyOfRange(a, 0, 3);
        for(int i : c)
            System.out.print(i + " ");
        System.out.println();

        // to string
        String sa = Arrays.toString(a);
        System.out.println(sa);
        System.out.println();

        // sort
        int[] d = {18, 62, 68, 82, 65, 9};
        System.out.println("before sort: " + "\n" + Arrays.toString(d));
        Arrays.sort(d);
        System.out.println("after sort: " + "\n" + Arrays.toString(d));

        // search
        System.out.println("62's position: " + Arrays.binarySearch(a, 62));

        // judge equal
        System.out.println(Arrays.equals(a,b));

        // fill
        int[] e = new int[10];
        Arrays.fill(e,5);
        System.out.println(Arrays.toString(e));
    }
}
