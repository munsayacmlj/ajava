package com.markmunsayac;

public class Main {

    public static void main(String[] args) {
        Items inventory = (Inventory)SystemFactory.getSystem("inventory");
        inventory.add("grapes", 1);
        inventory.displayItems();
        inventory.delete("grapes");
        inventory.displayItems();
    }
}
