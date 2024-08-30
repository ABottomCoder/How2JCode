package Basics.chapter8;

public interface AD {
    public void physicAttack();

    default public void kill(){
        System.out.println("杀啊");
    }
}
