import java.util.Scanner;

public class iff4 {
    public  static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int a,b,c,n=0,m=0;
        System.out.print("adadi1: ");
        a=scan.nextInt();
        System.out.print("adadi2: ");
        b=scan.nextInt();
        System.out.print("adadi3: ");
        c=scan.nextInt();
        if(a>0){n++;}else{m++;}
        if(b>0){n++;}else{m++;}
        if(c>0){n++;}else{m++;}
        System.out.println("Miqdori adadhoi musbat: " +n);
        System.out.println("Miqdori adadhoi manfi: " +m);
    }
}
