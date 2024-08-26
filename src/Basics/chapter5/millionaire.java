package Basics.chapter5;
import java.util.Scanner;

public class millionaire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rate = input.nextDouble();
        double target = input.nextDouble();
        double base = input.nextDouble();

        double totalIncome = 12 * base;
        int count = 1;
        while(totalIncome < target){
            totalIncome = totalIncome*(1+rate) + base;
            count++;
        }

        System.out.println(count);
    }
}
