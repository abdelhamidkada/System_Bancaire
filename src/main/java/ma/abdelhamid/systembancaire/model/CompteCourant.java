package ma.abdelhamid.systembancaire.model;

import ma.abdelhamid.systembancaire.exception.SoldeInsuffisantException;

/**
 * Cette classe représente un compte courant.
 * Elle autorise un découvert limité.
 */
public class CompteCourant extends CompteBancaire {

    private double decouvert;

    public CompteCourant(String numero, double soldeInitial, double decouvert) {
        super(numero, soldeInitial);
        this.decouvert = decouvert;
    }

    /**
     * Retrait avec prise en compte du découvert.
     */
    @Override
    public void retirer(double montant) throws SoldeInsuffisantException {
        if (solde + decouvert >= montant) {
            enregistrerRetrait(montant);
        } else {
            throw new SoldeInsuffisantException(
                    "Retrait refusé : découvert dépassé"
            );
        }
    }
}
