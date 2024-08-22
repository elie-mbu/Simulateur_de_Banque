package com.elie.project;

public class AccountBank {
    private String firstName;
    private String famillyName;
    private double balance;

    public AccountBank(String firstName, String famillyName, double initialBalance) {
        this.firstName = firstName;
        this.famillyName = famillyName;
        if (initialBalance < 0){
            System.out.println("ERREUR!!! le montant d'ouverture doit etre superieur 0 ");
            this.balance = initialBalance;
        }else {
            this.balance = initialBalance;
        }
    }

    // Methode pour deposer de l'argent
    public void deposit(double amount){
        if (amount >0){
            balance += amount;
            System.out.println("Deposé: " + amount + "$. Vous avez :" + balance + "$.");
        }else {
            System.out.println("Le montant du depot doit etre superieur a 0");
        }
    }

    // Methode pour retirer de l'argent
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Retiré : " + amount + " $. Vous avez : " + balance + " $.");
            } else {
                System.out.println("Fonds insuffisants. Solde actuel : " + balance + " $.");
            }
        } else {
            System.out.println("Le montant du retrait doit être supérieur à 0.");
        }
    }

    //// Méthode pour afficher le solde actuel
    public void displayBalance() {
        System.out.println(firstName+" "+famillyName +" Solde actuel : " + balance + " $.");
    }

}
