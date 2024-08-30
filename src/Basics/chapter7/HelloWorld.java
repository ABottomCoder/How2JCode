package Basics.chapter7;

public class HelloWorld {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        switch (season) {
            case SPRING:
                System.out.println("Spring");
                break;
            case SUMMER:
                System.out.println("Summer");
                break;
            case AUTUMN:
                System.out.println("Autumn");
                break;
            case WINTER:
                System.out.println("Winter");
                break;
        }
    }
}
