package Intermediate.chapter2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StreamTest {
    public static void main(String[] args){
        try {
            File f = new File("C:/Users/13087/GithubCode/How2JCode/src/Intermediate/chapter2/DOTA.md");
            FileInputStream fis = new FileInputStream(f);
            System.out.println(fis.available());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
