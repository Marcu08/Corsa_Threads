package com.example;

public class Main {
    public static void main(String[] args) {
        Corridore corridoreA = new Corridore("CorridoreA");
        Corridore corridoreB = new Corridore("CorridoreB");
        
        corridoreA.start();
        corridoreB.start();

        try{
            corridoreA.join();
            corridoreB.join();
        } catch (InterruptedException e) {
            System.out.println("Il thread è stato interrotto ");
        }
        System.out.println("Gara terminata!");
    }
}