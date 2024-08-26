package Basics.chapter2;

public class HeroMethod {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    float getArmor(){
        return armor;
    }

    void keng(){
        System.out.println("坑队友");
    }

    void addSpeed(int speed){
        moveSpeed += speed;
    }

    public static void main(String[] args) {
        HeroMethod garen = new HeroMethod();
        garen.name = "盖伦";
        garen.moveSpeed = 350;
        System.out.println(garen.moveSpeed);
        garen.addSpeed(100);
        System.out.println(garen.moveSpeed);
    }
}
