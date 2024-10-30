import java.util.Scanner;

public class bool22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,s1,s2,s3;
        System.out.print("a=");
        a=in.nextInt();
        boolean l;
        s1=(a/100);
        s2=(a/10)%10;
        s3=(a%10)/10;
        l=(s1<s2)&&(s2<s3) || (s1>s2)&&(s2>s3) ;
        System.out.println(l);
    }
}
