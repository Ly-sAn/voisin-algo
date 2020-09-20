package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.println("Veuillez saisir un nombre : ");
        int userNumberInput =Integer.parseInt(sc.next());



        if (userNumberInput > 0){
            userNumberInput *= 2;
            System.out.println("Votre nombre multiplié par 2 = " + userNumberInput);

        } else if (userNumberInput == 0){
            System.out.println("Veuillez saisir votre nom : ");
            String userNameInput = sc.next();
            if (userNameInput.length() > 7){
                System.out.println("Que ton nom est long");
            } else {
                System.out.println("Que ton nom est court");
            }

        } else {
            userNumberInput /= 2;
            System.out.println("Votre nombre divisé par 2 = " + userNumberInput);

        }
        System.out.println("Au revoir");
    }
}
