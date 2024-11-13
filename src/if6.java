import java.util.Scanner;

public class if6 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a,b;
        System.out.print("Adadin1: ");
        a=scan.nextInt();
        System.out.print("Adadi2: ");
        b=scan.nextInt();
        if(a>b){System.out.println("Kalontarin adad "+a+ " ast");}
        else{System.out.println("Kalontarin adad "+b+ " ast");}
    }
}
