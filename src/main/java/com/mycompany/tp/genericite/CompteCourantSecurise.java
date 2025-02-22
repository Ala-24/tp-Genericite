
package com.mycompany.tp.genericite;

public class CompteCourantSecurise<T> extends CompteCourant<T> implements Securisable {
    public CompteCourantSecurise(int numeroCompte, double solde, T devise, double limiteDecouvert) {
        super(numeroCompte, solde, devise, limiteDecouvert);
    }

    @Override
    public boolean verifierIdentite(String identifiant) {
        // Implémentation simple pour l'exemple
        return "admin".equals(identifiant);
    }
}