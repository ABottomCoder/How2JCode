package Basics.chapter7;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public Hero(){
        System.out.println("实例化一个对象的时候，必然调用构造方法");
    }

    public Hero(String name){
        this.name = name;
    }

    public Hero(String name, float hp){
        this(name);
        this.hp = hp;
    }

    public Hero(String name, float hp, float armor, int moveSpeed){
        this(name, hp);
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }
}
