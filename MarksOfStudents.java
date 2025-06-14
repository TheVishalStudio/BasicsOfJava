import java.util.Scanner;
public class MarksOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of Java");
        float Javamarks = sc.nextFloat();
        System.out.println("Enter the Marks of Scod");
        float Scodmarks = sc.nextFloat();
        System.out.println("Enter the Marks of Css ");
        float Cssmarks = sc.nextFloat();
        System.out.println("Enter the Marks of Maths");
        float Mathsmarks = sc.nextFloat();
        System.out.println("Enter the Marks of Ids");
        float Idsmarks = sc.nextFloat();



        float Totalmarks = Javamarks+Scodmarks+Mathsmarks+Cssmarks+Idsmarks;
        System.out.println("The Total Marks is : "+Totalmarks);
        float Percentage = (Totalmarks/500)*100;
        System.out.println("The Percentage is : "+Percentage);

        float Average = (Totalmarks/5);
        System.out.println("The Average is : "+Average);

    }
}
