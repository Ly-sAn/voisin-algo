package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int result;
        try {
            Scanner sc = new Scanner( System.in );

            System.out.println("Veuillez saisir un nombre : ");
            int userNumberInput =Integer.parseInt(sc.next());


            if (userNumberInput > 0){
                result = userNumberInput * 2;

            } else if (userNumberInput == 0){
                System.out.println("Veuillez saisir votre nom : ");
                String userNameInput = sc.next();
                result = userNameInput.length();
                if (result > 7){
                    System.out.println("Que ton nom est long");
                } else {
                    System.out.println("Que ton nom est court");
                }

            } else {
                result = userNumberInput / 2;

            }
        } catch (NumberFormatException e) {
            System.out.println("Désolé, votre n'est pas valide, je ne peux rien faire");
            result = -1;
        }
        System.out.println("Le résultat du calcul = " + result);
        System.out.println("Au revoir");
    }
}
