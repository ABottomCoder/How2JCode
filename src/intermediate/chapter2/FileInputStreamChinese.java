package Intermediate.chapter2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileInputStreamChinese {
    public static void main(String[] args) {
        File f = new File("C:/Users/13087/GithubCode/How2JCode/src/Intermediate/chapter2/lol2.txt");
        try (FileInputStream fis = new FileInputStream(f);) {
            byte[] all = new byte[(int) f.length()];
            fis.read(all);

            //文件中读出来的数据是
            System.out.println("文件中读出来的数据是：");
            for (byte b : all)
            {
                int i = b&0x00000ff;  //只取16进制的后两位
                System.out.println(Integer.toHexString(i));
            }
            System.out.println("把这个数字，放在UTF-8的棋盘上去：");
            String str = new String(all, StandardCharsets.UTF_8);
            System.out.println(str);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
