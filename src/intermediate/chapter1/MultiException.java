package Intermediate.chapter1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 处理多个异常的方法
public class MultiException {
    public static void main(String[] args){
        File f = new File("d:/LOL.exe");

        // 试图打开文件，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
        try{
            new FileInputStream(f);
            System.out.println("成功打开文件LOL.exe");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
        } catch(FileNotFoundException e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        } catch(ParseException e){
            System.out.println("日期格式解析错误");
            e.printStackTrace();
        }

    }
}

