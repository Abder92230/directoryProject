import java.util.Scanner;

/**
 * Repertoire
 * 
 * @author Abderrahmane
 */
public class Repertoire {
    private Contact[] tableauContacts = new Contact[20];

    /**
     * Méthode qui permet de parcourir le tableau de contact, si une position est
     * vide dans le tableau alors ajouter le contact dans la position vide du
     * tableau.
     */
    public void ajouterContact(Contact contactAajouter) {
        for (int i = 0; i < tableauContacts.length; i++) {
            if (tableauContacts[i] == null) {
                tableauContacts[i] = contactAajouter;
                tableauContacts[i].setId(i);
                return;
            }
        }
    }

    /**
     * Méthode qui permet de verifier si l'identifiant du contact saisie existe bien
     * dans le tableau de contact pour ensuite pouvoir supprimer le contact.
     */
    public void supprimerContact() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Veuillez saisir l'identifiant du contact à supprimer : ");
        int identifiantEntreParLutilisateur = lectureClavier.nextInt();
        for (int i = 0; i < tableauContacts.length; i++) {
            if (tableauContacts[i] != null && tableauContacts[i].getId() == identifiantEntreParLutilisateur) {
                tableauContacts[i] = null;
            }
        }
    }

    /**
     * Méthode qui permet de Consulter le repertoire, Si le repertoire est Vide
     * alors lui Afficher un message d'erreur "il est vide" Sinon lui Afficher les
     * Contacts du repertoire existant.
     */
    public void consulterRepertoire() {
        if (this.estVide()) {
            System.out.println("Votre repertoire est vide");
        } else {
            afficherLesContactsDuRepertoire();
        }
    }

    /**
     * Méthode qui va permettre de parcourir mon tableau de contact et d'afficher
     * les contacts de ce tableau Méthode qui parcoure mon tableau de contact et les
     * affiche
     */
    public void afficherLesContactsDuRepertoire() {
        for (int i = 0; i < tableauContacts.length; i++) {
            if (tableauContacts[i] != null)
                tableauContacts[i].afficherIdNomPrenomDuContact();
        }
    }

    /**
     * 1. Quel contact voulez-vous modifier ? 2. Saisie de l'identifiant
     */
    public void modifierInformations() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Saisissez l'identifiant du contact à modifier : ");
        int idSaisie = lectureClavier.nextInt();
        for (int i = 0; i < tableauContacts.length; i++) {
            if (tableauContacts[i] != null && tableauContacts[i].getId() == idSaisie) {
                tableauContacts[i].modifierContact();
            }
        }
        return;
    }

    /**
     * Méthode qui renvoie un booléen indiquant si le répeertoire est vide ou non.
     * Méthodologie : parcourir le tableau de contact, le répertoire n'est pas vide
     * si un contact est présent, il est vide si aucune occurence de contact n'est
     * trouvée à la fin du parcours.
     * 
     * @return false si le répertoire n'est pas vide, true sinon.
     */
    public boolean estVide() {
        for (int i = 0; i < this.tableauContacts.length; i++) {
            if (this.tableauContacts[i] != null) {
                return false;
            }
        }
        return true;
    }
}
