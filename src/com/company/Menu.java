package com.company;
import java.util.Calendar;
import java.util.Date;

import java.util.ArrayList;


public class Menu {
    // fields
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    // constructors
    public Menu(Date lastUpdated, ArrayList<MenuItem> items) {
        this.lastUpdated = lastUpdated;
        this.items = items; // how to tie this to another ArrayList
    }

    // getters/setters

    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    public void setDate(Date updateDate) {
        this.lastUpdated = updateDate;
    }

    public ArrayList<MenuItem> getMenuOptions() {
        return items;
    }

    public void setMenuOptions(ArrayList<MenuItem> menuOptions) {
        this.items = menuOptions;
    }

    // methods



    public ArrayList<MenuItem> addItem(MenuItem item) {
        this.items.add(item);
        return this.items;
    }

    public void removeItem(MenuItem item) {
        int toBeRemoved = -1;
        for (int i=0; i<items.size(); i++) {
            if (items.get(i).equals(item)) {
                toBeRemoved = i;
            }
        }
    }

    public void printMenu() {
        for (MenuItem item : items) {
            System.out.println("\n*****\n" + item.menuItemName + ": $" + item.price + "\n" + item.menuItemDescription + " | " + item.showItemStatus() + " menu item ( added " + item.menuItemCreateDate + " )\n*****");
        }

    }

    public void lastUpdateMenuItems() {
        // add code here
    }


    public static void main(String[] args) {
        MenuItem pretzel = new MenuItem(2, "Pretzel", "bread substance", "apps", 5.99);
        MenuItem wings = new MenuItem(3, "Wings", "meat substance", "apps", 9.99);
        MenuItem pickleChips = new MenuItem(4, "Pickle Chips", "veggie substance", "apps", 7.99);

        MenuItem steak = new MenuItem(5, "Steak", "meat substance", "main", 34.99);
        MenuItem burger = new MenuItem(6, "Burger", "sandwich substance", "main", 11.99);
        MenuItem salmon = new MenuItem(7, "Salmon", "fish substance", "main", 24.99);

        MenuItem iceCream = new MenuItem(8, "Ice Cream", "dairy substance", "desserts", 4.99);
        MenuItem pie = new MenuItem(9, "Pie", "pie substance", "desserts", 7.99);
        MenuItem weddingCake = new MenuItem(10, "Wedding Cake", "cake substance", "desserts", 12.99);

        Date today = Calendar.getInstance().getTime();
        // Date pretzelUpdate = new Date().setTime(1606355002000);
        ArrayList<MenuItem> appList = new ArrayList<>();

        Menu appMenu = new Menu(today, appList);

        // pretzel.setMenuItemCreateDate(2020-11-26);
        appMenu.addItem(pretzel);
        appMenu.addItem(wings);
        appMenu.addItem(pickleChips);
        // pretzel.setMenuItemCreateDate();
        appMenu.printMenu();
    }

}