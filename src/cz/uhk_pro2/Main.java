package cz.uhk_pro2;

import cz.uhk_pro2.models.PizzaMenu;
import cz.uhk_pro2.models.PizzaMenuItem;

public class Main {

    public static void main(String[] args) {
        PizzaMenu menu = new PizzaMenu();
        menu.addItem(new PizzaMenuItem("Pepperoni", "has pepperoni",5));
        menu.addItem(new PizzaMenuItem("Hot", "is hot", 6));

        System.out.println("Posledni uprava: " + menu.getLastUpdate());
    }
}
