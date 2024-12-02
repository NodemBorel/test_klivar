import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre la largeur: ");
        double largeur = scanner.nextDouble();

        System.out.println("Entre la longeur: ");
        double longeur = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(longeur, largeur);

        rectangle.displayResultat();

    }
}