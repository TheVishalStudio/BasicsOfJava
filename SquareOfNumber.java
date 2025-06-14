import java.util.Scanner;
public class SquareOfNumber {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the 1st number:");
        double x= sc.nextDouble();
        double z= x*x;
        System.out.println("The Square is is "+ z);

    }
}
