package ma.abdelhamid.systembancaire.exception;

/**
 * Exception levée lorsque le compte recherché
 * n'existe pas dans la banque.
 */
public class CompteIntrouvableException extends Exception {

    public CompteIntrouvableException(String message) {
        super(message);
    }
}
