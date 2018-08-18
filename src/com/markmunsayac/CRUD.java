package com.markmunsayac;

public interface CRUD {
    public void add(String name, Integer amount);
    public void delete(String name);
    public void changeItemName(String oldName, String newName);
    public void displayItems();
}
