import java.util.Scanner;
public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ;");
        int n = sc.nextInt();
        int counter;
        counter = 0;
        for (int i = 0; counter > 0; i++) {
            counter = n / 10;
            if (n == 0) {
                System.out.println(counter);
            }
        }
    }
}


