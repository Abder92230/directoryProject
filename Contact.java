import java.util.Scanner;

/**
 * Contact
 * 
 * @author Abderrahmane
 */
public class Contact {

    private String nom, prenom, numeroTelephone, mail, profession;
    private int id;

    /**
     * Constructeur de Contact
     * 
     * @param nom             nom du contact
     * @param prenom          prenom du contact
     * @param numeroTelephone numéro de téléphone du contact
     * @param mail            mail du contact
     * @param profession      profession du contact
     * @param id              id du contact
     */
    /**
     * public Contact(String nom, String prenom, String numeroTelephone, String
     * mail, String profession, int id) { this.nom = nom; this.prenom = prenom;
     * this.numeroTelephone = numeroTelephone; this.mail = mail; this.profession =
     * profession; this.id = id; }
     */

    public Contact() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Veuillez saisir votre Nom : ");
        this.nom = lectureClavier.next();
        System.out.println("Veuillez saisir votre Prenom : ");
        this.prenom = lectureClavier.next();
        System.out.println("Veuillez saisir votre numero de telephone : ");
        this.numeroTelephone = lectureClavier.next();
        System.out.println("Veuillez saisir votre mail: ");
        this.mail = lectureClavier.next();
        System.out.println("Veuillez saisir votre profession: ");
        this.profession = lectureClavier.next();
        System.out.println("Vos informations ont ete enregistrées");
        afficherInformationsContact();
    }

    /**
     * Méthode qui demande à saisir un nouveau nom et modifie ensuite le nom du
     * contacte en conséquence de la saisie.
     */
    public void demandeEtModifieNom() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Veuillez entrer le nouveau Nom : ");
        String nouveauNom = lectureClavier.next();
        if (nouveauNom == "")
            System.out.println("Vous devez saisir un Nom ! ");
        else
            this.nom = nouveauNom;
        System.out.println("Le nom a bien été modifie");
    }

    /**
     * Méthode qui demande à saisir un nouveau Prenom et modifie ensuite le Prenom
     * du contacte en conséquence de la saisie.
     */
    public void demandeEtModifiePrenom() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Veuillez entrer le nouveau Prenom : ");
        String nouveauPrenom = lectureClavier.next();
        if (nouveauPrenom == "")
            System.out.println("Vous devez saisir un Prenom ! ");
        else
            this.prenom = nouveauPrenom;
        System.out.println("Le Prenom a bien été modifie");
    }

    /**
     * Méthode qui demande à saisir un nouveau numero de telephone et modifie
     * ensuite le numero de telephone du contacte en conséquence de la saisie.
     */
    public void demandeEtModifieNumeroTelephone() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Veuillez entrer le nouveau numero de telephone : ");
        String nouveauNumeroTelephone = lectureClavier.next();
        if (nouveauNumeroTelephone == "")
            System.out.println("Vous devez saisir un numero de telephone ! ");
        else
            this.numeroTelephone = nouveauNumeroTelephone;
        System.out.println("Le numero de telephone a bien été modifie");
    }

    /**
     * Méthode qui demande à saisir un nouveau mail et modifie ensuite le mail du
     * contacte en conséquence de la saisie.
     */
    public void demandeEtModifieMail() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Veuillez entrer le nouveau mail : ");
        String nouveauMail = lectureClavier.next();
        if (nouveauMail == "")
            System.out.println("Vous devez saisir un mail ! ");
        else
            this.mail = nouveauMail;
        System.out.println("Le mail a bien été modifie");
    }

    /**
     * Méthode qui demande à saisir une nouvelle profession et modifie ensuite la
     * profession du contacte en conséquence de la saisie.
     */
    public void demandeEtModifieProfession() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Veuillez entrer la nouvelle profession : ");
        String nouvelleProfession = lectureClavier.next();
        if (nouvelleProfession == "")
            System.out.println("Vous devez saisir une profession ! ");
        else
            this.profession = nouvelleProfession;
        System.out.println("La profession a bien été modifie");
    }

    /**
     * Renvoie une représentation d'un Contact (avec ses informations, donc) sous
     * forme d'uen chaîne de caractère (que l'on pourra, par ex, afficher en
     * console).
     * 
     * @return une représentation d'un Contact (String)
     */
    public void afficherInformationsContact() {
        System.out.println("A- Nom : " + this.nom);
        System.out.println("B- Prenom : " + this.prenom);
        System.out.println("C- Numero de telephone : " + this.numeroTelephone);
        System.out.println("D- Mail : " + this.mail);
        System.out.println("E- Profession : " + this.profession);
    }

    /**
     * Méthode qui permet de modifier les informations du contact et de saisir les
     * nouvelles infos
     */
    public void modifierContact() {
        Scanner lectureClavier = new Scanner(System.in);
        afficherInformationsContact();
        System.out.println("Quelle information voulez-vous modifier ?");
        String lettreSaisie = lectureClavier.next();
        while (!(lettreSaisie.equals("A") || lettreSaisie.equals("B") || lettreSaisie.equals("C")
                || lettreSaisie.equals("D") || lettreSaisie.equals("E"))) {
            System.out.println("Veuillez saisir une lettre existante !");
            lettreSaisie = lectureClavier.next();
        }
        if (lettreSaisie.equals("A")) {
            demandeEtModifieNom();
        } else if (lettreSaisie.equals("B")) {
            demandeEtModifiePrenom();
        } else if (lettreSaisie.equals("C")) {
            demandeEtModifieNumeroTelephone();
        } else if (lettreSaisie.equals("D")) {
            demandeEtModifieMail();
        } else if (lettreSaisie.equals("E")) {
            demandeEtModifieProfession();
        }
        afficherInformationsContact();
    }

    /**
     * Méthode qui permet d'afficher l'identifiant, nom et prenom du contact.
     */
    public void afficherIdNomPrenomDuContact() {
        System.out.println(this.id + "-" + this.nom + " " + this.prenom);
    }

    /**
     * Méthode qui permet de récuperer l'identifiant autre part.
     * 
     * @return l'identifiant du contact concerné.
     */
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Méthode qui permet de recuperer le nom autre part.
     * 
     * @return le nom du contact concerné.
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Méthode qui permet de recuperer le prenom autre part
     * 
     * @return le prenom du contact concerné.
     */
    public String getPrenom() {
        return this.prenom;
    }
}