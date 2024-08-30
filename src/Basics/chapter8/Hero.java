package Basics.chapter8;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public Hero(){
        System.out.println("Hero Constructor");
    }

    public Hero(String name){
        this.name = name;
        System.out.println("Hero's one parameter Constructor");
    }

    public String toString(){
        return this.name;
    }

    protected void finalize(){
        System.out.println("Hero's final Constructor");
    }

    public boolean equals(Object o){
        if(o instanceof Hero){
            Hero h = (Hero)o;
            return this.hp == h.hp;
        }

        return false;
    }

    class BattleScore{
        int kill;
        int die;
        int assit;

        public void legendary(){
            if(kill >= 8){
                System.out.println(name + "超神");
            }else{
                System.out.println(name + "尚未超神");
            }
        }
    }

    public static void main(String[] args){
        Hero hero = new Hero("德莱文");
        System.out.println(hero.toString());

        BattleScore score = hero.new BattleScore();
        score.kill = 9;
        score.legendary();
    }
}
