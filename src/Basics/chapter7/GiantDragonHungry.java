package Basics.chapter7;

public class GiantDragonHungry {
    private GiantDragonHungry() {}

    private static GiantDragonHungry instance = new GiantDragonHungry();

    public static GiantDragonHungry getInstance() {
        return instance;
    }
}
