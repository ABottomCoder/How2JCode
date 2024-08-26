package Basics.chapter3;

// if a variable is declared by final, it has only one time to get value
public class Final {
    public void method1(){
        final int i = 5;

        // i = 10; error

        final int a;
        a = 10;
        // a = 11; error
    }
}
