import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int x = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int y = sc.nextInt();
        System.out.println("Enter the 3rd number");
        int z = sc.nextInt();
        if (x>y && x>z) {
            System.out.println((x + "is largerest amoong all three numbers!"));
        }
            else if (y>x && y>z){
                System.out.println(y +"is largerest amoong all three numbers!");
                }
                else {
                    System.out.println(z +" " +
                            "is largerest amoong all three numbers!");
                }
            }

        }

