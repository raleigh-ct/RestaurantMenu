package com.company;
import java.util.Date;
import java.time.LocalDate;
import java.util.Calendar;

public class MenuItem {
    // fields
    protected final int menuItemId;
    protected String menuItemName;
    protected String menuItemDescription;
    protected String menuCategory;
    protected LocalDate menuItemCreateDate;
    protected double price;

    // constructors

    public MenuItem(int menuItemId, String menuItemName, String menuItemDescription, String menuCategory, double price) {
        this.menuItemId = menuItemId;
        this.menuItemName = menuItemName;
        this.menuItemDescription = menuItemDescription;
        this.menuCategory = menuCategory;
        this.menuItemCreateDate = LocalDate.now();
        this.price = price;
    }

    public MenuItem(int menuItemId, String menuItemName, String menuCategory, double price) {
        this.menuItemId = menuItemId;
        this.menuItemName = menuItemName;
        this.menuItemDescription = "Description Unavailable";
        this.menuCategory = menuCategory;
        this.menuItemCreateDate = LocalDate.now();
        this.price = price;
    }

    public String showItemStatus() {
        LocalDate date = LocalDate.now();
        LocalDate lastMonth = menuItemCreateDate.plusMonths(1);
        int compare = lastMonth.compareTo(date);
        if (compare > 0) {
            return "NEW";
        } else {
            return "Long time favorite";
        }
    }

    //Getters/Setters
    public int getMenuItemId() {
        return menuItemId;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public String getMenuItemDescription() {
        return menuItemDescription;
    }

    public String getMenuCategory() {
        return menuCategory;
    }

    public LocalDate getMenuItemCreateDate() {
        return menuItemCreateDate;
    }

    public void setMenuItemName(String aMenuItemName) {
        menuItemName = aMenuItemName;
    }

    public void setMenuItemDescription(String aMenuItemDescription) {
        menuItemDescription = aMenuItemDescription;
    }

    public void setMenuCategory(String aMenuCategory) {
        menuCategory = aMenuCategory;
    }

    public void setMenuItemCreateDate(LocalDate aMenuItemCreateDate) {
        menuItemCreateDate = aMenuItemCreateDate;
    }
}