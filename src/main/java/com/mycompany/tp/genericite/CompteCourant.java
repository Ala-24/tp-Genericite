
package com.mycompany.tp.genericite;

public class CompteCourant<T> extends Compte<T> {
    private double limiteDecouvert;

    public CompteCourant(int numeroCompte, double solde, T devise, double limiteDecouvert) {
        super(numeroCompte, solde, devise);
        this.limiteDecouvert = limiteDecouvert;
    }

    @Override
    public void retirer(double montant) {
        if (getSolde() - montant >= -limiteDecouvert) {
            super.retirer(montant);
        } else {
            System.out.println("Retrait refusé : limite de découvert dépassée.");
        }
    }

    @Override
    public void afficherSolde() {
        System.out.println("Compte Courant - Solde: " + getSolde() + " " + getDevise());
    }
}