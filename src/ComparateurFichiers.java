import java.io.File;
public class ComparateurFichiers {
    public static boolean comparerTailleFichiers(String filePath1, String filePath2) {
        File fichier1 = new File(filePath1);
        File fichier2 = new File(filePath2);

        long tailleFichier1 = fichier1.length();
        long tailleFichier2 = fichier2.length();

        return tailleFichier1 == tailleFichier2;
    }
}
