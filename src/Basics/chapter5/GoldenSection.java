package Basics.chapter5;

import static java.lang.Math.abs;

public class GoldenSection {
    public static void main(String[] args) {
        double base = 0.618;
        double ans1 = 1, ans2 = 1, diff = 100;
        for(double i=1;i<21;i++){
            for(double j=1;j<21;j++){
                if(abs(i/j-base) < diff){
                    diff = abs(i/j-base);
                    ans1 = i;
                    ans2 = j;
                }
            }
        }

        System.out.println(ans1 + " : " + ans2);
    }
}
