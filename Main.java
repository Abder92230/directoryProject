import java.util.Scanner;

public class Main {

    /**
     * Méthode qui permet d'afficher le menu
     */
    public static void afficherMenu() {
        System.out.println(
                "A : Consulter le répertoire\nB : Ajouter un contact\nC : Modifier un contact\nD : Supprimer un contact\nE : Quitter le programme");
    }

    /**
     * 1. Creation d'un repertoire 2. Saisie possible des champs dans le menu 3.
     * Conditions pour chaque lettre.
     */
    public static void lanceurRepertoire() {
        Repertoire monRepertoire = new Repertoire();
        Scanner lectureClavier = new Scanner(System.in);
        afficherMenu();
        String lettre = lectureClavier.next();

        while (!lettre.equals("E")) {
            if (lettre.equals("A")) {
                monRepertoire.consulterRepertoire();
            }

            if (lettre.equals("B")) {
                Contact contact = new Contact();
                monRepertoire.ajouterContact(contact);
            }

            if (lettre.equals("C")) {
                monRepertoire.modifierInformations();
            }

            if (lettre.equals("D")) {
                monRepertoire.supprimerContact();
            }
            afficherMenu();
            lettre = new Scanner(System.in).next();
        }
        lectureClavier.close();
        return;
    }

    public static void main(String[] args) {
        lanceurRepertoire();
    }
}