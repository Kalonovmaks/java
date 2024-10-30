import java.util.Scanner;

public class bool36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("координатаи x1 (1-8): ");
            int x1 = scanner.nextInt();
            System.out.print("координатаи y1 (1-8): ");
            int y1 = scanner.nextInt();
            System.out.print("координатаи x2 (1-8): ");
            int x2 = scanner.nextInt();
            System.out.print("координатаи y2 (1-8): ");
            int y2 = scanner.nextInt();
            boolean l;

            l= (x1 == x2 || y1 == y2);
            System.out.println(l);
            }

        }

