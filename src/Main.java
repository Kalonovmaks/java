import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,s1,s2,s3,s4;
        a=in.nextInt();
        boolean l;
        s1=(a/1000);
        s2=(a/100)%10;
        s3=(a%100)/10;
        s4=(a%100)%10;
        l=(s1==s4) &&(s2==s3);
        System.out.println(l);
    }
}