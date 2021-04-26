package com.company;
import java.util.Date;
import java.time.LocalDate;

public class MenuItem {
    // fields
    protected final int menuItemId;
    protected String menuItemName;
    protected String menuItemDescription;
    protected String menuCategory;
    protected LocalDate menuItemCreateDate;

    // constructors

    public MenuItem(int menuItemId, String menuItemName, String menuItemDescription, String menuCategory) {
        this.menuItemId = menuItemId;
        this.menuItemName = menuItemName;
        this.menuItemDescription = menuItemDescription;
        this.menuCategory = menuCategory;
        this.menuItemCreateDate = LocalDate.now();
    }

    public MenuItem(int menuItemId, String menuItemName, String menuCategory) {
        this.menuItemId = menuItemId;
        this.menuItemName = menuItemName;
        this.menuItemDescription = "Description Unavailable";
        this.menuCategory = menuCategory;
        this.menuItemCreateDate = LocalDate.now();
    }

    public String showItemStatus() {
        LocalDate date = LocalDate.now();
        LocalDate lastMonth = menuItemCreateDate.plusMonths(1);
        int compare = lastMonth.compareTo(date);
        if (compare > 0) {
            return "New";
        } else {
            return "Existing";
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