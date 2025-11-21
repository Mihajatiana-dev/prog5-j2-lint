package org.example;

public class Main {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet("black", 10);

        myWallet.addVola(50);

        myWallet.open();
        System.out.println("Current balance: " + myWallet.checkVola());

        myWallet.close();

        myWallet.isLost();
        myWallet.addVola(20);
    }
}