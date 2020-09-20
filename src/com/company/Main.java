package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner( System.in );

    public static void Exo1(){
        int result;
        try {

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

    public static void Exo2(){
        System.out.println("Veuillez saisir un chiffre supérieur à 0");
        int userNumberInput = Integer.parseInt(sc.next());
        int sommePair = 0;
        int sommeImpair = 0;
        int sommeTotale = 0;
        if ( userNumberInput <= 0 ){
            System.out.println("J'ai dit supérieur à 0");
        } else {

            for (int i = 0; i <= userNumberInput; i++){
                if (i % 2 == 0){
                    sommePair += i;
                } else {
                    sommeImpair += i;
                }
                sommeTotale += i;
            }
        }
        System.out.println("La somme totale des chiffres allant de 0 à " + userNumberInput + " = " + sommeTotale );
        System.out.println("La somme des pairs allant de 0 à " + userNumberInput + " = " + sommePair );
        System.out.println("La somme des impairs allant de 0 à " + userNumberInput + " = " + sommeImpair );
    }

    public static void main(String[] args) {



        System.out.println("Veuillir choisir votre numéro de votre exercice: " );

        int exoNumber = Integer.parseInt(sc.next());
        switch (exoNumber){
            case 1 -> {
                Exo1();
            }
            case 2 -> {
                Exo2();
            }
            default -> System.out.println("Veuillez saisir un autre exercice");
        }


    }
}
