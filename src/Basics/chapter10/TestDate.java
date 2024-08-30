package Basics.chapter10;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("当前时间：");
        System.out.println(d1);
        System.out.println();

        Date d2 = new Date(54005000);
        System.out.println(d2);
        System.out.println();

        Date now = new Date();
        System.out.println("当前时间：" + now.toString());
        System.out.println("当前时间getTime()返回值是："+ now.getTime());

        Date zero = new Date(0);
        System.out.println("用0作为构造方法，得到的日期是："+ zero);
    }
}
