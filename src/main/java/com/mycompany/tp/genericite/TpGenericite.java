
package com.mycompany.tp.genericite;

import java.util.*;

public class TpGenericite {
    private Map<Integer, Compte<?>> comptes = new HashMap<>();

    public void ajouterCompte(Compte<?> compte) {
        comptes.put(compte.getNumeroCompte(), compte);
    }

    public Compte<?> rechercherCompte(int numeroCompte) {
        return comptes.get(numeroCompte);
    }

    public void supprimerCompte(int numeroCompte) {
        comptes.remove(numeroCompte);
    }

    public void afficherComptesTries() {
        List<Compte<?>> listeComptes = new ArrayList<>(comptes.values());
        listeComptes.sort((c1, c2) -> Double.compare(c2.getSolde(), c1.getSolde()));

        for (Compte<?> compte : listeComptes) {
            compte.afficherSolde();
        }
    }

    public static <T> void transferer(Compte<T> source, Compte<T> destination, double montant) {
        source.retirer(montant);
        destination.deposer(montant);
    }

    public static void main(String[] args) {
        TpGenericite gestion = new TpGenericite();

        Compte<String> compte1 = new CompteCourant<>(12345, 1000.0, "EUR", 500.0);
        Compte<String> compte2 = new CompteEpargne<>(67890, 2000.0, "USD", 2.5);

        gestion.ajouterCompte(compte1);
        gestion.ajouterCompte(compte2);

        gestion.afficherComptesTries();

        transferer(compte1, compte2, 200.0);
        gestion.afficherComptesTries();
    }
}