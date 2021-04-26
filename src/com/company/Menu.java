package com.company;

import java.util.ArrayList;

public class Menu {

    public static void main(String[] args) {
        ArrayList<MenuItem> allItems = new ArrayList<>();

        MenuItem pretzel = new MenuItem(2, "Pretzel", "bread substance", "apps");
        MenuItem wings = new MenuItem(3, "Wings", "meat substance", "apps");
        MenuItem pickleChips = new MenuItem(4, "Pickle Chips", "veggie substance", "apps");

        MenuItem steak = new MenuItem(5, "Steak", "meat substance", "main");
        MenuItem burger = new MenuItem(6, "Burger", "sandwich substance", "main");
        MenuItem salmon = new MenuItem(7, "Salmon", "fish substance", "main");

        MenuItem iceCream = new MenuItem(8, "Ice Cream", "dairy substance", "desserts");
        MenuItem pie = new MenuItem(9, "Pie", "pie substance", "desserts");
        MenuItem weddingCake = new MenuItem(10, "Wedding Cake", "cake substance", "desserts");


        allItems.add(pretzel);
        allItems.add(wings);
        allItems.add(pickleChips);
        allItems.add(steak);
        allItems.add(burger);
        allItems.add(salmon);
        allItems.add(iceCream);
        allItems.add(pie);
        allItems.add(weddingCake);

        public void showMenu(){

        }

        Menu testMenu = new Menu;
        System.out.println(testMenu.showMenu());
    }


}
