import java.util.Scanner;

public class Exercise3 {

    // Fonction qui génère le mot avec 'x' nombre de o
    public static String generateWoow(int x) {
        char c='o';
        String str = "W"+ String.valueOf(c).repeat(x) + "w";
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture de la valeur x
        System.out.println("Veuillez entrer un nombre entre 1 et 49:");
        int x = scanner.nextInt();

        // Assurez-vous que x est dans la plage autorisée
        if (x > 0 && x < 50) {
            // Appel de la fonction generateWoow et affichage du résultat
            String result = generateWoow(x);
            System.out.println(result);
        } else {
            System.out.println("Veuillez entrer un nombre entre 1 et 49.");
        }
        
        scanner.close();
    }
}
