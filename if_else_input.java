import java.util.Scanner;
public class if_else_input {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr 1st number ;");
        double a = sc.nextDouble();
        System.out.println("Enter the second number:");
        double b = sc.nextDouble();
        double c = a/b;
        if (a>b)
        System.out.println("The division of a/b is "+c);
        else
        System.out.println("division is not possible");
    }
}
