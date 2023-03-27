package com.kenzie.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Menu {
    public String name;
    public MenuItem[] items;

    public Menu(String name, ArrayList<MenuItem> items) {

    }


    public abstract void displayMenu();

    public abstract void addItem(int itemID);

    public abstract void removeItem(int itemID);




}