package Basics.chapter6;

public class ArrayCopy {
    public static void main(String[] args) {
        /*
        System.arraycopy(src, srcPos, dest, destPos, length)
        src: 源数组
        srcPos: 从源数组复制数据的起始位置
        dest: 目标数组
        destPos: 复制到目标数组的起始位置
        length: 复制的长度
         */
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        System.arraycopy(a, 3, b, 0, 2);
        for(int i : b)
            System.out.print(i + " ");

        System.out.println("\n" + b);
    }
}
