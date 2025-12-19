package ma.abdelhamid.systembancaire.model;

import ma.abdelhamid.systembancaire.exception.SoldeInsuffisantException;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstraite représentant un compte bancaire.
 * Elle regroupe les attributs et méthodes communs
 * à tous les types de comptes.
 */
public abstract class CompteBancaire {

    protected String numero;
    protected double solde;
    protected List<Transaction> transactions;

    /**
     * Constructeur du compte bancaire.
     */
    public CompteBancaire(String numero, double soldeInitial) {
        this.numero = numero;
        this.solde = soldeInitial;
        this.transactions = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * Dépôt d'argent sur le compte.
     */
    public void deposer(double montant) {
        solde += montant;
        transactions.add(new Transaction(TypeTransaction.DEPOT, montant));
    }

    /**
     * Méthode abstraite de retrait.
     * Chaque type de compte définit ses propres règles.
     */
    public abstract void retirer(double montant) throws SoldeInsuffisantException;

    /**
     * Méthode protégée utilisée par les classes filles
     * pour enregistrer un retrait valide.
     */
    protected void enregistrerRetrait(double montant) {
        solde -= montant;
        transactions.add(new Transaction(TypeTransaction.RETRAIT, montant));
    }
}
