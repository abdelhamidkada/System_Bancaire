package ma.abdelhamid.systembancaire.model;

/**
 * Cette énumération définit les différents types
 * de transactions possibles dans le système bancaire.
 * L'utilisation d'un enum permet d'éviter les erreurs
 * liées aux chaînes de caractères.
 */
public enum TypeTransaction {
    DEPOT,
    RETRAIT,
    VIREMENT
}
