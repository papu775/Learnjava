import java.util.Scanner;
public class Pattan4{
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int number = input.nextInt();
         for(int i=number;0<i;i--){
             for(int j=1;j<=i;j++){
                System.out.print("* ");
             }
           System.out.println();
         }
    }
}