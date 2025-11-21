package org.example;

public class Wallet {
    private final String color;
    private final int size;
    private double value;
    private boolean isOpen;
    private boolean isLost;

    public Wallet(String color, int size) {
        this.color = color;
        this.size = size;
        this.value = 0;
        this.isOpen = false;
        this.isLost = false;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void addVola(double volaToAdd) {
        if (!isLost) {
            value += volaToAdd;
            System.out.println(volaToAdd + " added to wallet");
        } else {
            System.out.println("Cannot add money. Wallet is lost!");
        }
    }

    public double getVola() {
        return value;
    }

    public void open() {
        if (!isLost) {
            isOpen = true;
        }
    }

    public void close() {
        if (!isLost) {
            isOpen = false;
        }
    }

    public void isLost() {
        isLost = true;
        isOpen = false;
        System.out.println("Wallet is lost!");
    }

    public double checkVola() {
        if (!isLost && isOpen) {
            return value;
        } else if (isLost) {
            System.out.println("Cannot check money. Wallet is lost!");
            return 0;
        } else {
            System.out.println("Wallet is closed. Open it first!");
            return 0;
        }
    }
}
