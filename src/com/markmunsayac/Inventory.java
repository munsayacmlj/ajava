package com.markmunsayac;

import java.lang.Override;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Inventory extends Sistema implements CRUD {
    private String name;
    private static final String ADDRESS = "40 Birch Hill St. \n" +
                                                "Saint Johns, FL 32259";
    private static Map<String, Object> storageItems = new HashMap<>();

    Inventory() {
        Item item1 = new Item.Builder().setItemName("Apple").build();
        storageItems.put(item1.getItemName(), 5);
//        Item item2 = new Item("Banana");
//        storageItems.put(item2.getItemName(), 3);
//        Item item3 = new Item("Mango");
//        storageItems.put(item3.getItemName(), 1);
    }

    @Override
    public void setSystemName(String name) {
        this.name = name;
    }

    @Override
    public String getSystemName() {

        return this.name;
    }

    @Override
    public String getAddress() {

        return ADDRESS;
    }

    @Implement
    public void add(String name, Integer amount) {
        Item newItem = new Item(name);
        storageItems.put(newItem.getItemName(), amount);
    }

    @Implement
    public void delete(String key) {
        storageItems.remove(key);
    }

    @Implement
    public void changeItemName(String oldName, String newName) {
        storageItems.put(newName, storageItems.remove(oldName));
    }

    @Implement
    public void displayItems() {
        Set keys = storageItems.keySet();
        System.out.println("List of Storage Items:");
        for (Iterator i = keys.iterator(); i.hasNext();) {
            String key = (String) i.next();
            System.out.println(key + " = " + storageItems.get(key));
        }
    }
}
