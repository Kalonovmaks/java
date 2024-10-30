import java.util.Scanner;

public class bigin36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cуръати автомобили 1 (V1): ");
        double V1 = scanner.nextDouble();

        System.out.print("Cуръати автомобили 2 (V2) : ");
        double V2 = scanner.nextDouble();

        System.out.print("Масофаи байн (S) : ");
        double S = scanner.nextDouble();

        System.out.print("масофаи байни онҳо баъди соат (T) : ");
        double T = scanner.nextDouble();

        double result = (S + (V1 + V2) * T);

        System.out.printf(String.valueOf(result));

    }
}
