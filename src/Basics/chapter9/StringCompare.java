package Basics.chapter9;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = new String(s1);

        // false, because s1 and s2 point to different string
        System.out.println(s1 == s2);

        // true, only compare value
        System.out.println(s1.equals(s2));

        // a special example
        String s3 = "Hello World2";
        String s4 = "Hello World2";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
