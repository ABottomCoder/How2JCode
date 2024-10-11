package Intermediate.chapter3;

/*
在Hero的attack方法中，当发现敌方英雄的血量为0的时候，抛出该异常
1. 创建一个EnemyHeroIsDeadException实例
2. 通过throw 抛出该异常
3. 当前方法通过 throws 抛出该异常

在外部调用attack方法的时候，就需要进行捕捉，并且捕捉的时候，可以通过e.getMessage() 获取当时出错的具体原因
 */

public class Hero {
    public String name;
    protected float hp;
}

