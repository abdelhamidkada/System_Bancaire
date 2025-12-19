package ma.abdelhamid.systembancaire.model;

import java.time.LocalDateTime;

/**
 * Cette classe représente une transaction bancaire.
 * Chaque transaction possède un type, un montant
 * et une date de réalisation.
 */
public class Transaction {

    private final TypeTransaction type;
    private final double montant;
    private final LocalDateTime date;

    /**
     * Constructeur de la transaction.
     * La date est automatiquement générée.
     */
    public Transaction(TypeTransaction type, double montant) {
        this.type = type;
        this.montant = montant;
        this.date = LocalDateTime.now();
    }

    public TypeTransaction getType() {
        return type;
    }

    public double getMontant() {
        return montant;
    }

    public LocalDateTime getDate() {
        return date;
    }

    /**
     * Permet d'afficher une transaction
     * de manière lisible dans la console.
     */
    @Override
    public String toString() {
        return date + " | " + type + " | " + montant + " DH";
    }
}
