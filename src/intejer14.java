import java.util.Scanner;

public class intejer14 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int a,b,c;
         System.out.print("adadro dokhil kuned: ");
         int number = scanner.nextInt();

         a=(number%100)%10;
         b=(number/10)%10;
         c=(number/100);
         System.out.print(c);
         System.out.print(a);
         System.out.print(b);
     }
}