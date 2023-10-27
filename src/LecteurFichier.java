import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class LecteurFichier implements LecteurFichierInterface {
    @Override
    public void lireFichier(String filePath) {
        try (BufferedReader lecteur = new BufferedReader(new FileReader(filePath))) {
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void lireFichierInverse(String filePath) {
        try (BufferedReader lecteur = new BufferedReader(new FileReader(filePath))) {
            String ligne;
            StringBuilder content = new StringBuilder();
            while ((ligne = lecteur.readLine()) != null) {
                content.insert(0, ligne + "\n");
            }
            System.out.println(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void lireFichierPalindromique(String filePath) {
        try {
            BufferedReader lecteur = new BufferedReader(new FileReader(filePath));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                String reversedLine = new StringBuilder(ligne).reverse().toString();
                System.out.println(reversedLine);
            }
            lecteur.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}