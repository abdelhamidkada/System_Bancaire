package ma.abdelhamid.systembancaire.service;

import ma.abdelhamid.systembancaire.exception.CompteIntrouvableException;
import ma.abdelhamid.systembancaire.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe de service qui centralise
 * la gestion des comptes bancaires.
 */
public class BanqueService implements Transferable {

    private List<CompteBancaire> comptes = new ArrayList<>();

    /**
     * Ajoute un compte à la banque.
     */
    public void ajouterCompte(CompteBancaire compte) {
        comptes.add(compte);
    }

    /**
     * Recherche un compte par son numéro.
     */
    public CompteBancaire chercherCompte(String numero)
            throws CompteIntrouvableException {

        for (CompteBancaire c : comptes) {
            if (c.getNumero().equals(numero)) {
                return c;
            }
        }
        throw new CompteIntrouvableException(
                "Compte " + numero + " introuvable"
        );
    }

    /**
     * Virement simple vers un compte destinataire.
     */
    @Override
    public void virer(CompteBancaire destinataire, double montant) {
        destinataire.deposer(montant);
    }
}
