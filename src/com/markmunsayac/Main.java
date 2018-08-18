package com.markmunsayac;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("What would you like to do? ");
        System.out.println("1. Inventory");
        System.out.println("2. Bank");

        int choice = scan.nextInt();
        switch (choice) {
            case 1: main.initInventory();
                    break;
            case 2: main.initBank();
                    break;
            default: break;
        }
    }

    public void  initBank() {
        Bank bank = (Bank) SystemFactory.getSystem("bank");
        bank.setSystemName("Bank of Mark");
        System.out.println(bank.getSystemName());
        System.out.println(bank.getAddress());
    }

    public void initInventory() {
        Inventory inventory = (Inventory)SystemFactory.getSystem("inventory");
        System.out.println("==============Initializing Inventory============");
        displayChoices();
        int choice = scan.nextInt();
        do {
            switch (choice) {
                case 1: inventory.displayItems();
                         break;
                case 2:
                    System.out.print("Enter new item name: ");
                    String newItem = scan.next();
                    System.out.print("Amount: ");
                    int amount = scan.nextInt();
                    inventory.add(newItem, amount);
                    break;
                case 3:
                    System.out.print("Enter item to be deleted: ");
                    String deleteItem = scan.next();
                    inventory.delete(deleteItem);
                    break;
                default: break;
            }
            displayChoices();
            choice = scan.nextInt();
        } while(choice != 4);
    }

    public static void displayChoices() {
        System.out.println("\n");
        System.out.println("1. Display all items");
        System.out.println("2. Add new item");
        System.out.println("3. Delete existing item");
        System.out.println("4. Exit");
        System.out.println("\n");
    }

    public static void shopChoices() {
        System.out.println("\n");
        System.out.println("1. Add to Cart");
        System.out.println("2. Remove From Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Checkout");
        System.out.println("5. Back");
        System.out.println("\n");
    }
}
