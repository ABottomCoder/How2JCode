package intermediate.chapter1;

import java.io.File;
import java.io.FileInputStream;

// FileNotFoundException 是Exception的子类，使用Exception也可以catch住FileNotFoundException
public class TestException2 {
    public static void main(String[] args){
        File f = new File("d:/LOL.exe");

        // 试图打开文件，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
        try{
            new FileInputStream(f);
            System.out.println("成功打开文件LOL.exe");
        }
        catch(Exception e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }

    }
}
