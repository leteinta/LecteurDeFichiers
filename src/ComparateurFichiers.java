import java.io.File;
public class ComparateurFichiers {
    private File fichier1;
    private File fichier2;

    public ComparateurFichiers(File f1, File f2) {
        this.fichier1 = f1;
        this.fichier2 = f2;
    }

    public boolean comparerTailleFichiers() {

        long tailleFichier1 = fichier1.length();
        long tailleFichier2 = fichier2.length();

        return tailleFichier1 == tailleFichier2;
    }
}
