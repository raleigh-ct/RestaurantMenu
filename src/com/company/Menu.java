package com.company;
import java.util.Date;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;



public class Menu {
    ArrayList<MenuItem> allItems = new ArrayList<>();
    MenuItem pretzel = new MenuItem(2, "Pretzel", "bread substance", "apps", 5.99);
    MenuItem wings = new MenuItem(3, "Wings", "meat substance", "apps", 9.99);
    MenuItem pickleChips = new MenuItem(4, "Pickle Chips", "veggie substance", "apps", 7.99);

    MenuItem steak = new MenuItem(5, "Steak", "meat substance", "main", 34.99);
    MenuItem burger = new MenuItem(6, "Burger", "sandwich substance", "main", 11.99);
    MenuItem salmon = new MenuItem(7, "Salmon", "fish substance", "main", 24.99);

    MenuItem iceCream = new MenuItem(8, "Ice Cream", "dairy substance", "desserts", 4.99);
    MenuItem pie = new MenuItem(9, "Pie", "pie substance", "desserts", 7.99);
    MenuItem weddingCake = new MenuItem(10, "Wedding Cake", "cake substance", "desserts", 12.99);



    // fields
    private Date lastUpdated;
    private ArrayList<MenuItem> menuOptions;

    // constructors
    public Menu(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
        this.menuOptions = allItems; // how to tie this to another ArrayList
    }

    // getters/setters

    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    public void setDate(Date updateDate){
        this.lastUpdated = updateDate;
    }

    public ArrayList<MenuItem> getMenuOptions() {
        return menuOptions;
    }

    public void setMenuOptions(ArrayList<MenuItem> menuOptions) {
        this.menuOptions = menuOptions;
    }

    // methods
    public void addItem(MenuItem item) {
        // add item code here. Use ArrayList add() method
    }

    public void removeItem(MenuItem item) {
        // add item code here
    }

    public void printMenu() {
        for (MenuItem item : allItems){
            System.out.println(item.menuItemName);
        }

    }
    public void lastUpdateMenuItems() {
        // add code here
    }

    // method
//    public void createMenu(String catgory){
//        for (int i=0; i<allitems.length; i++)
//    }

//    public static void main(String[] args) {
//
//        ArrayList<MenuItem> allItems = new ArrayList<>();
//
//        // Create array with all menu items
//        MenuItem pretzel = new MenuItem(2, "Pretzel", "bread substance", "apps", 5.99);
//        MenuItem wings = new MenuItem(3, "Wings", "meat substance", "apps", 9.99);
//        MenuItem pickleChips = new MenuItem(4, "Pickle Chips", "veggie substance", "apps", 7.99);
//
//        MenuItem steak = new MenuItem(5, "Steak", "meat substance", "main", 34.99);
//        MenuItem burger = new MenuItem(6, "Burger", "sandwich substance", "main", 11.99);
//        MenuItem salmon = new MenuItem(7, "Salmon", "fish substance", "main", 24.99);
//
//        MenuItem iceCream = new MenuItem(8, "Ice Cream", "dairy substance", "desserts", 4.99);
//        MenuItem pie = new MenuItem(9, "Pie", "pie substance", "desserts", 7.99);
//        MenuItem weddingCake = new MenuItem(10, "Wedding Cake", "cake substance", "desserts", 12.99);
//
//        allItems.add(pretzel);
//        allItems.add(wings);
//        allItems.add(pickleChips);
//        allItems.add(steak);
//        allItems.add(burger);
//        allItems.add(salmon);
//        allItems.add(iceCream);
//        allItems.add(pie);
//        allItems.add(weddingCake);
//
//
//        }

    }

