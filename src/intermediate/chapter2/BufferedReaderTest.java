package Intermediate.chapter2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BufferedReaderTest {
    public static void main(String[] args) {
        File f = new File("C:/Users/13087/GithubCode/How2JCode/src/Intermediate/chapter2/lol2.txt");

        // First, write to the file
        try (
                FileWriter fw = new FileWriter(f);
                PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.println("写入整行测试1");
            pw.println("写入整行测试2");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Then, read from the file
        try (
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
