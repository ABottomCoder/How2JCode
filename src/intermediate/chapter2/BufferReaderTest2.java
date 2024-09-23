package Intermediate.chapter2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BufferReaderTest2 {
    public static void main(String[] args) {
        File f = new File("C:/Users/13087/GithubCode/How2JCode/src/Intermediate/chapter2/lol2.txt");

        try (
                FileWriter fw = new FileWriter(f);
                PrintWriter pw = new PrintWriter(fw);
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
        ) {
            pw.println("写入整行测试7");
            pw.println("写入整行测试5");
            pw.flush(); // 确保数据被写入文件

            // 添加1秒延迟
            Thread.sleep(1000);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}