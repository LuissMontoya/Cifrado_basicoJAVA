
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiss M
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("\n");
        char letras[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
        for (int i = 0; i < letras.length; i++) {
            System.out.print((i + 1) + ". " + letras[i] + "\t");
        }
        System.out.println("\n");
        char encriptacion[] = {'!', '#', '$', '%', '&', '/', '(', ')', '=', ',', '*', '+', 'R', '.', 'E', '-', 'D', 'E', 'S', '2', '0', '1', '9', 'B', 'A', 'C', 'F', ' '};

        for (int i = 0; i < encriptacion.length; i++) {
            System.out.print((i + 1) + ". " + encriptacion[i] + "\t");
        }
        System.out.println("\n");
        System.out.println("-----------------------------------------------------------\n\n");
        String texto = JOptionPane.showInputDialog(null, "Digite el texto a Encriptar # ", JOptionPane.QUESTION_MESSAGE);
        System.out.println("Texto a Encriptar: ");

        char vector[] = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            vector[i] = texto.charAt(i);
            System.out.print(vector[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                if (vector[j] == letras[i]) {
                    vector[j] = encriptacion[i];
                }
            }
        }
        System.out.println("Encriptación: " + "\n");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "");
        }
        System.out.println("\n");
        System.out.println("-----------------------------------------------------------\n\n");
        String texto2 = JOptionPane.showInputDialog(null, "Digite el texto a Encriptar # ", JOptionPane.QUESTION_MESSAGE);
        System.out.println("Texto a Desencriptar: ");

        char vector2[] = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            vector2[i] = texto.charAt(i);
            System.out.print(vector2[i] + "");
        }
        System.out.println("\n");
        for (int i = 0; i < encriptacion.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
                if (vector2[j] == encriptacion[i]) {
                    vector2[j] = letras[i];
                }
            }
        }
        System.out.println("Desencriptar: " + "\n");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i] + "");
        }
    }
}
