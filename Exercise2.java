import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

    // 1. méthode pour retourner le nombre de caractères dans la chaîne.
    public static int taille(String str) {
        return str.length();
    }

    // 2. méthode pour retourner le premier caractère de la chaîne.
    public static char PremierCharacter(String str) {
        return str.charAt(0);
    }

    // 3. méthode pour retourner une partie de la chaîne de caractères. Notez que le caractère à l'index de fin n'est pas inclus.
    public static String souschaine(String str, int start, int end) {
        return  (str.subSequence(start, end)).toString();
    }

    // 4. méthode pour convertir la chaîne en lettres majuscules.
    public static String majuscule(String str) {
        return str.toUpperCase();
    }

    // 5. méthode pour convertir la chaîne en lettres minuscules.
    public static String minuscule(String str) {
        return    str.toLowerCase();
    }

    // 6. methode pour remplacer toutes les occurrences de oldChar par newChar.
    public static String ChangerCharacter(String str, char oldChar, char newChar) {
        return str.replace(oldChar,newChar);
    }

    // 7. méthode pour supprimer les espaces de début et de fin de la chaîne.
    public static String SansString(String str) {
        return str.trim();
    }
   
    // 8. méthode pour vérifier si la chaîne commence par le préfixe spécifié.
    public static boolean Prefix(String str, String prefix) {
        return str.indexOf(prefix)==0;
    }

    
    public static void main(String[] args) {
        String example = "  Hello, World!  ";

        
        System.out.println("Length of the string: " + taille(example));

       
        System.out.println("First character of the string: " + PremierCharacter(example));

        
        System.out.println("Substring (7, 12): " + souschaine(example, 7, 12));

        
        System.out.println("Uppercase: " + majuscule(example));

     
        System.out.println("Lowercase: " + minuscule(example));

       
        System.out.println("Replacing 'o' with '0': " + ChangerCharacter(example, 'o', '0'));

        
        System.out.println("Trimmed string: '" + SansString(example) + "'");

       
        System.out.println("Starts with '  Hel': " + Prefix(example, "  Hel"));
    }
}
