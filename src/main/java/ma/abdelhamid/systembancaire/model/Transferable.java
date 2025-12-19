package ma.abdelhamid.systembancaire.model;

/**
 * Interface qui définit le comportement de virement.
 * Toute classe qui implémente cette interface
 * doit proposer une méthode de virement.
 */
public interface Transferable {

    /**
     * Effectue un virement vers un compte destinataire.
     *
     * @param destinataire le compte qui reçoit l'argent
     * @param montant le montant à transférer
     */
    void virer(CompteBancaire destinataire, double montant);
}
