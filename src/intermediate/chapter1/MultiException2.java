package intermediate.chapter1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 处理多个异常的方法2，将多个异常放在一个catch中，缺点是需要单独确定是什么异常
public class MultiException2 {
    public static void main(String[] args){
        File f = new File("d:/LOL.exe");

        // 试图打开文件，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
        try{
            new FileInputStream(f);
            System.out.println("成功打开文件LOL.exe");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
        } catch(FileNotFoundException | ParseException e){
            if(e instanceof FileNotFoundException)
                System.out.println("d:/LOL.exe不存在");
            if(e instanceof ParseException)
                System.out.println("日期格式解析错误");
            e.printStackTrace();
        } finally{
            System.out.println("无论文件是否存在，都会执行的代码");
        }
    }
}

