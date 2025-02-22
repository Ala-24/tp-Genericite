
package com.mycompany.tp.genericite;


public class CompteEpargne<T> extends Compte<T> {
    private double tauxInteret;

    public CompteEpargne(int numeroCompte, double solde, T devise, double tauxInteret) {
        super(numeroCompte, solde, devise);
        this.tauxInteret = tauxInteret;
    }

    public void calculerInteret() {
        double interet = getSolde() * tauxInteret / 100;
        deposer(interet);
    }

    @Override
    public void afficherSolde() {
        System.out.println("Compte Epargne - Solde: " + getSolde() + " " + getDevise());
    }
}