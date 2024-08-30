package Basics.chapter8;

public class ADHero extends Hero implements AD{

    @Override
    public void physicAttack(){
        System.out.println("进行了物理攻击");
    }

    public ADHero(String name){
        super(name);
        System.out.println("AD Hero Constructor");
    }

    public static void main(String[] args){
        ADHero de = new ADHero("德莱文");
        System.out.println(de.toString());
    }
}
