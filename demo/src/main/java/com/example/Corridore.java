package com.example;
import java.util.Random;

public class Corridore extends Thread{
    private String nome;

    public Corridore(String nome) {
        this.nome = nome;
    }

    public void run() {
        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            System.out.println(this.nome + " Il corridore ha fatto " + i + " passo ");
            int randomN = rand.nextInt(600) + 200 ;
            
            try {
                Thread.sleep(randomN);
            } catch (InterruptedException e) {
                System.out.println("Messaggio di errore" + e.getMessage());
                Thread.currentThread().interrupt(); //funzione che serve per resettare lo stato del thread
                return; 
            }
        }
        System.out.println("Arrivato al traguardo!!");
    }
}
