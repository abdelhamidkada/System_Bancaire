package ma.abdelhamid.systembancaire.app;

import ma.abdelhamid.systembancaire.exception.SoldeInsuffisantException;
import ma.abdelhamid.systembancaire.model.*;
import ma.abdelhamid.systembancaire.service.BanqueService;

/**
 * Classe principale du programme.
 * Elle sert à tester le fonctionnement
 * du système bancaire.
 */
public class Main {

    public static void main(String[] args) {

        BanqueService banque = new BanqueService();

        // Création des comptes
        CompteCourant compteCourant =
                new CompteCourant("CC001", 1000, 500);

        CompteEpargne compteEpargne =
                new CompteEpargne("CE001", 2000);

        // Ajout des comptes à la banque
        banque.ajouterCompte(compteCourant);
        banque.ajouterCompte(compteEpargne);

        try {
            // Opérations bancaires
            compteCourant.deposer(300);
            compteCourant.retirer(1500);
            compteEpargne.retirer(2500);
        } catch (SoldeInsuffisantException e) {
            System.out.println("⚠️ Erreur : " + e.getMessage());
        }

        // Virement vers le compte épargne
        banque.virer(compteEpargne, 200);

        // Affichage des historiques
        System.out.println("=== Historique Compte Courant ===");
        compteCourant.getTransactions().forEach(System.out::println);

        System.out.println("\n=== Historique Compte Épargne ===");
        compteEpargne.getTransactions().forEach(System.out::println);
    }
}
