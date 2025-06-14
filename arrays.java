import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //initialising the arrays
        int[] numbers = new int[3];
        System.out.println("Enter the numbers");
        //taking input using loops
        for(int i=0;i<3;i++){
            numbers[i] = sc.nextInt();
        }
       /* declaring arrays
       numbers[0]=5;
        numbers[1]=4;
        numbers[2]=3;*/
        //printing the arrays
        for (int  i=0; i<3;i++){
            System.out.println(numbers[i]);
        }

    }
}
