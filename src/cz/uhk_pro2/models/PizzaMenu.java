package cz.uhk_pro2.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {
    private List<PizzaMenuItem> items;
    private LocalDateTime lastUpdate;

    public PizzaMenu() {
        items = new ArrayList<PizzaMenuItem>();
    }

    public List<PizzaMenuItem> getItems() {
        return items;
    }

    public void addItem(PizzaMenuItem item) {
        items.add(item);
        lastUpdate = LocalDateTime.now(); //staticka metoda

    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
}
