package Intermediate.chapter2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        // use InputStream
//        try (InputStream is = System.in;) {
//            int k = 2;
//            while (k > 0) {
//                k--;
//                // 敲入a,然后敲回车可以看到
//                // 97 13 10
//                // 97是a的ASCII码
//                // 13 10分别对应回车换行
//                int i = is.read();
//                System.out.println(i);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // use Scanner read a line
        Scanner s = new Scanner(System.in);

        int m = 2;
        while(m>0){
            m--;
            String line = s.nextLine();
            System.out.println(line);
        }

        int n = 2;
        while(n > 0){
            n--;
            int a = s.nextInt();
            System.out.println(a);
        }
    }
}
