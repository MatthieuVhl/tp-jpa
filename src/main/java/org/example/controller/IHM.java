package org.example.controller;

import java.util.Scanner;

public class IHM {

    public static void main() {
        entityManagerFactory = Persistence.createEntityManagerFactory("tp-jpa");


        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("#### To Do List ####");
            System.out.println("1. Ajouter un client");
            System.out.println("2. Ajouter un compte");
            System.out.println("3. Marquer une banque");

            System.out.println("0. Quitter l'application");
            System.out.println("Choix : ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            switch (choice){
                case 1:
                    addClient(scanner);
                    break;
                case 2:
                    addCompte();
                    break;
                case 3:
                    addBanque(scanner);
                    break;

                case 0:
                    System.out.println("Bye");
                    entityManagerFactory.close();
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");

            }

        }while (choice != 0);
    }

}
