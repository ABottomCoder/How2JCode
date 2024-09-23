package Intermediate.chapter1;

/*
一个英雄攻击另一个英雄的时候，如果发现另一个英雄已经挂了，就会抛出EnemyHeroIsDeadException
创建一个类EnemyHeroIsDeadException，并继承Exception
提供两个构造方法
1. 无参的构造方法
2. 带参的构造方法，并调用父类的对应的构造方法
 */

public class EnemyHeroIsDeadException extends Exception {
    public EnemyHeroIsDeadException(){

    }

    public EnemyHeroIsDeadException(String msg){
        super(msg);
    }
}
