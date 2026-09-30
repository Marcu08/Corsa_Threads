package com.example;
import java.util.Random;
public class Corridore {
    private String nome;

    public Corridore(String nome) {
        this.nome = nome;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Il corridore A ha fatto" + i);
            Random rand = new Random();
            int randomN = rand.nextInt(600);
            randomN += 200; 
            Thread.sleep(randomN);
            
        }
}
