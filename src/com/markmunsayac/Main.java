package com.markmunsayac;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        Inventory inventory = (Inventory)SystemFactory.getSystem("inventory");
//        inventory.displayItems();
        Main main = new Main();

        System.out.println("What would you like to do? ");
        System.out.println("1. Inventory");
        System.out.println("2. Bank");

        int choice = scan.nextInt();
        if (choice == 1) {
            main.initInventory();
        }
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
        String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
        System.out.println("\n");
        System.out.println("1. Display all items");
        System.out.println("2. Add new item");
        System.out.println("3. Delete existing item");
        System.out.println("4. Exit");
        System.out.println("\n");
    }
}
