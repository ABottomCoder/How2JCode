package Basics.chapter2;

public class Item {
    String name;
    int price;

    public static void main(String []args){
        Item blood = new Item();
        blood.name = "Blood";
        blood.price = 50;

        Item shoes = new Item();
        shoes.name = "Shoes";
        shoes.price = 300;

        Item sword = new Item();
        sword.name = "Sword";
        sword.price = 350;
    }
}
