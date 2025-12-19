package ma.abdelhamid.systembancaire.model;

import ma.abdelhamid.systembancaire.exception.SoldeInsuffisantException;

/**
 * Cette classe représente un compte épargne.
 * Aucun découvert n'est autorisé.
 */
public class CompteEpargne extends CompteBancaire {

    public CompteEpargne(String numero, double soldeInitial) {
        super(numero, soldeInitial);
    }

    /**
     * Retrait autorisé uniquement si le solde est suffisant.
     */
    @Override
    public void retirer(double montant) throws SoldeInsuffisantException {
        if (solde >= montant) {
            enregistrerRetrait(montant);
        } else {
            throw new SoldeInsuffisantException(
                    "Retrait refusé : solde insuffisant (épargne)"
            );
        }
    }
}
