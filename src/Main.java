import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String cheminFichierTexte = "/Users/allet/IdeaProjects/Lecteur de fichiers/src/mon_fichier.txt";
            String cheminFichierCSV = "/Users/allet/IdeaProjects/Lecteur de fichiers/src/test.csv";

            System.out.println("Exemple d'utilisation pour un fichier texte lu de manière ordinaire :");
            LecteurFichier lecteurTexte = new FichierTexte();
            lecteurTexte.lireFichier(cheminFichierTexte);
            scanner.nextLine();

            System.out.println("Exemple d'utilisation pour un fichier texte lu à l'envers :");
            LecteurFichier lecteurTexteInverse = new FichierTexte();
            lecteurTexteInverse.lireFichierInverse(cheminFichierTexte);
            scanner.nextLine();

            System.out.println("Exemple d'utilisation pour un fichier texte lu de manière palindromique :");
            LecteurFichier lecteurTextePalindromique = new FichierTexte();
            lecteurTextePalindromique.lireFichierPalindromique(cheminFichierTexte);
            scanner.nextLine();

            System.out.println("Exemple d'utilisation pour un fichier CSV lu de manière ordinaire :");
            LecteurFichier lecteurCSV = new FichierCSV();
            lecteurCSV.lireFichier(cheminFichierCSV);
            scanner.nextLine();

            System.out.println("Exemple d'utilisation pour un fichier CSV lu à l'envers :");
            LecteurFichier lecteurCSVInverse = new FichierCSV();
            lecteurCSVInverse.lireFichierInverse(cheminFichierCSV);
            scanner.nextLine();

            System.out.println("Exemple d'utilisation pour un fichier CSV lu de manière palindromique :");
            LecteurFichier lecteurCSVPalindromique = new FichierCSV();
            lecteurCSVPalindromique.lireFichierPalindromique(cheminFichierCSV);
            scanner.nextLine();

            // Comparateur tailles de fichiers
            if (ComparateurFichiers.comparerTailleFichiers(cheminFichierTexte, cheminFichierCSV)) {
                System.out.println("Les fichiers ont la même taille.");
            } else {
                System.out.println("Les fichiers ont des tailles différentes.");
            }

        }
    }