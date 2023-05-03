package com.example.milkman;

public class Item {

    String name;
    int cow,buff;

    public Item(String name, int cow , int buff) {
        this.name = name;
        this.cow = cow;
        this.buff=buff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCow() {
        return cow;
    }

    public void setCow(int liter) {
        this.cow = liter;
    }

    public int getBuff() {
        return buff;
    }

    public void setBuff(int liter) {
        this.buff = liter;
    }

}
