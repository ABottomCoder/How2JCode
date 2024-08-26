package Basics.chapter3;

public class DataConvert {
    public static void main(String[] args) {
        // big->small, automatic
        // small->big, force
        char c = 'A';
        short s = 80;

        c = (char)s;
        // s = c; error
    }
}
