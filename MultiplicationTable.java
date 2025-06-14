import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        int z;
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the number");
        int x = sc.nextInt();
        for(int i=1;i<11;i++){
            z = x*i;
            System.out.println(x + "*" + i + "=" +z);
           // System.out.println(x + " * " + i + " = " + z);


    }
}
}
