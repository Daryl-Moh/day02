package prog;

import cart.Item;
import cart.Apple;
import cart.Orange;

public class Main{

    public static void main(String[] args) {
        /*
        Item apple = new Item("apple", "Apple");
        Item orange = new Item("orange", "Orange");

        apple.setPrice(.5f);
        apple.setQuantity(10);

        orange.setPrice(0.7f);
        orange.setQuantity(15);
         */
        Apple apple = new Apple();
        apple.setType = ("washington");
        Orange orange = new Orange();
        
        System.out.printf("apple code: %s\n", apple.getCode());
        System.out.printf("orange code: %s\n", orange.getCode());

        Item item = apple;
        System.out.printf("item code: %s\n", item.getCode());

        //Casting
        Apple washington = (Apple)item;
        System.out.printf("washington code: %s\n", washington.getCode());
        // orange = (Orange) item but item already contains apple
        System.out.printf("Is item and orange? %b\n", item instanceof Orange);
        if (item instanceof Orange)
            orange = (Orange)item;

        // list 
        // add apple 10 0.5
        // add orange 5 0.3
        // list 
        // 1. Apple x 10 @ 0.5
        // 2. Orange x 5 @ 0.3
        // Checkout 
        // The total price is ____ 

    }

    
    

}

