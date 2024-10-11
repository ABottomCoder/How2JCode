package Intermediate.chapter3;

import java.util.ArrayList;

public class ArrayListTest {
    @SuppressWarnings("rawTypes")
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        Hero gailun = new Hero();
        gailun.name = "Gailun";
        heros.add(gailun);
        System.out.println(heros.size());

        heros.add(new Hero());
        System.out.println(heros.size());
    }
}
