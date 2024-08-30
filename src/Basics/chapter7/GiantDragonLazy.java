package Basics.chapter7;

public class GiantDragonLazy {
    private GiantDragonLazy() {}

    private static GiantDragonLazy instance;

    public static GiantDragonLazy getInstance() {
        if (instance == null) {
            instance = new GiantDragonLazy();
        }

        return instance;
    }
}
