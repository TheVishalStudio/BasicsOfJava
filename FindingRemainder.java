import java.util.Scanner;
public class FindingRemainder {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dividend:");

        int x= sc.nextInt();

        System.out.println("Enter Divisor:");

        int y= sc.nextInt()
                ;

       // int q =x/y;

        //int z = x-(y*q);

       // System.out.println("The remainder when "+x+" is divided by "+y+" is "+z);

        int z = x%y;
        System.out.println("The remainder when "+x+" is divided by "+y+" is "+z);
    }
}

