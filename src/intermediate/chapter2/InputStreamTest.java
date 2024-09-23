package Intermediate.chapter2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
InputStream是字节输入流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
FileInputStream 是InputStream子类，以FileInputStream 为例进行文件读取
 */

public class InputStreamTest {
    public static void main(String[] args){
        try{
            File f = new File("C:/Users/13087/GithubCode/How2JCode/src/Intermediate/chapter2/DOTA.md");
            // 创建基于文件的输入流
            FileInputStream fis = new FileInputStream(f);
            // 创建字节数组，其长度就是文件长度
            byte[] all = new byte[(int)f.length()];
            // 以字节流形式读取文件全部内容
            fis.read(all);
            for(byte b : all){
                System.out.println(b);
            }

            // 每次使用完流都应该进行关闭
            fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            File f2 = new File("C:/Users/13087/GithubCode/How2JCode/src/Intermediate/chapter2/lol2.txt");
            byte data[] = {88, 89};

            FileOutputStream fos = new FileOutputStream(f2);
            fos.write(data);
            fos.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
