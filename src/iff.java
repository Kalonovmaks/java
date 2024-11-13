import java.util.Scanner;

public class iff {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("a= ");
        int a=scan.nextInt();
        if(a>0) { a+=1;}
        else if (a<0) {a-=2;}
        else {a=10;}
        System.out.println(a);
}
}
