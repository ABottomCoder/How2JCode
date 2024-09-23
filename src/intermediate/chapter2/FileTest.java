package Intermediate.chapter2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) throws IOException {
        // 绝对路径
        File f1 = new File("C:/Users/13087/GithubCode/How2JCode/src/Intermediate/chapter2");

        // 使用f1为父目录创建对象文件
        File f3 = new File(f1, "LOL.md");
        System.out.println("f3 绝对路径：" + f3.getAbsolutePath());

        // 文件的基本操作
        File f4 = new File("C:/Users/13087/GithubCode/How2JCode/src/Intermediate/chapter2/LOL.md");

        // 文件是否存在
        System.out.println("判断是否存在：" + f4.exists());

        // 是否是文件夹
        System.out.println("判断是否是文件夹：" + f4.isDirectory());

        // 是否是文件（非文件夹）
        System.out.println("判断是否是文件" + f4.isFile());

        // 获取文件长度
        System.out.println("获取文件长度" + f4.length());

        // 文件最后修改时间
        long time = f4.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件最后修改时间：" + d);
        // 设置文件修改时间为1970.1.1 08:00:00
        f4.setLastModified(0);

        // 文件重命名
        File f5 = new File("C:/Users/13087/GithubCode/How2JCode/src/Intermediate/chapter2/DOTA.md");
        f4.renameTo(f5);
        System.out.println("把LOL.exe改名为DOTA.exe");


        File f = new File("d:/LOLFolder/skin/garen.ski");

        // 以字符串数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        f.list();

        // 以文件数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        File[]fs= f.listFiles();

        // 以字符串形式返回获取所在文件夹
        f.getParent();

        // 以文件形式返回获取所在文件夹
        f.getParentFile();
        // 创建文件夹，如果父文件夹skin不存在，创建就无效
        f.mkdir();

        // 创建文件夹，如果父文件夹skin不存在，就会创建父文件夹
        f.mkdirs();

        // 创建一个空文件,如果父文件夹skin不存在，就会抛出异常
        f.createNewFile();
        // 所以创建一个空文件之前，通常都会创建父目录
        f.getParentFile().mkdirs();

        // 列出所有的盘符c: d: e: 等等
        f.listRoots();

        // 刪除文件
        f.delete();

        // JVM结束的时候，刪除文件，常用于临时文件的删除
        f.deleteOnExit();

    }
}
