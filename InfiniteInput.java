import java.util.Scanner;
public class InfiniteInput {
    public static int positive(int x) {
        int count =1;
        System.out.println(count);
        return count+1;    }

    public static int negative(int x) {
        System.out.println(x);
        return 0;
    }


    public static int numiszero(int x){
        System.out.println(+x);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();

        for(int i=0;i<3;i++) {
            System.out.println("Enter the next number");
            x = sc.nextInt();
            for (int j = 0; j < 3; j++) {
                if (x > 0) {
                    positive(x);
                } else if (x < 0) {
                    negative(x);
                } else {
                    numiszero(x);
                }
            }
        }

    }
}
