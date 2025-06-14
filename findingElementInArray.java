package JavaKaBasics;

import java.util.Scanner;

public class findingElementInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();
        int[][] arrays2d = new int [rows][columns];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arrays2d[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0; j<columns;j++){
               if(arrays2d[i][j]==0){
                   System.out.println("item found at "+ i + j);
               }
            }
            System.out.println();
        }
    }
}
