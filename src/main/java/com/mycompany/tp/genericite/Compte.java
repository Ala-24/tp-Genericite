
package com.mycompany.tp.genericite;
public class Compte<T> {
    private int numeroCompte;
    private double solde;
    private T devise;

    public Compte(int numeroCompte, double solde, T devise) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.devise = devise;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant.");
        }
    }

    public void afficherSolde() {
        System.out.println("Solde: " + solde + " " + devise);
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public T getDevise() {
        return devise;
    }
}
