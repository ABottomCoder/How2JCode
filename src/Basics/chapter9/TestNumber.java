package Basics.chapter9;

public class TestNumber {
    public static void main(String[] args) {
        int i = 5;
        Integer it = new Integer(i);
        Integer it2 = i;

        int i2 = it.intValue();
        int i3 = it;

        System.out.println(it instanceof Number);

        // int to string
        // way 1
        String str = String.valueOf(i);

        // way 2
        String str2 = it.toString();

        // string to int
        int k = Integer.parseInt(str);

        // math method
        float f1 = 5.4f;
        float f2 = 5.5f;
        System.out.println(Math.round(f1));
        System.out.println(Math.round(f2));

        System.out.println(Math.random());
        System.out.println(Math.random() * 10);

        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2, 4));

        System.out.println(Math.PI);

        System.out.println(Math.E);
    }
}
