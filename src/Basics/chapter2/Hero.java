package Basics.chapter2;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public static void main(String[] args){
        Hero garen = new Hero();
        garen.name = "Garen";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;

        Hero teemo = new Hero();
        teemo.name = "Teemo";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
    }
}
