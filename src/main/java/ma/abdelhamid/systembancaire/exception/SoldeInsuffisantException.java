package ma.abdelhamid.systembancaire.exception;

/**
 * Exception levée lorsqu'une opération
 * est impossible à cause d'un solde insuffisant.
 */
public class SoldeInsuffisantException extends Exception {

    public SoldeInsuffisantException(String message) {
        super(message);
    }
}
