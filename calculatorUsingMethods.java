import java.util.Scanner;

public class calculatorUsingMethods {
    public static int sums(int x, int y) {
        int sum = x + y;
        System.out.println("The Sum is :" + sum);
        return 0;
    }

        public static int substractions( int x, int y){
        int substraction = x-y;
        System.out.println("The substraction  is :" + substraction);
        return 0;
    }
    public static int products( int x, int y) {
        int product = x * y;
        System.out.println("The Product  is :" + product);
        return 0;
    }

    public static double divisions( double x, double y) {
        double division = x /y;
        System.out.println("The division is :" + division);
        return 0;
    }

        public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the Operation");
        String operator = sc.next();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        if (operator.equals("+")){
            sums(x, y);
        }
        else if (operator.equals("-")) {
            substractions(x,y);
        }
        else if (operator.equals("*")){
            products(x,y);
            }
        else if(operator.equals("/")){
            divisions(x,y);
            }
        else{
            System.out.println("Invalid Operation");
        }
    }

}
