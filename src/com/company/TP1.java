package com.company;

public class Main {

    public static void main(String[] args) {
        int[] tableau = {18, 27, 42, 8, 41, 17, 3};
        for (int i = 0; i < tableau.length; i++){
            int s = tableau[i];
            System.out.println("Score joueur " + (i + 1) + " = " + s);
        }
    }
}
