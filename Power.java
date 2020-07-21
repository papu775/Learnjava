import java.util.Scanner;
public class Power{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter first number: ");
       int number1 = input.nextInt();
       System.out.print("Enter second number: ");
       int number2 = input.nextInt();
       int temp = 1;
       for (int i=1;i<=number2;i++){
           temp =temp*number1;
       }
      System.out.print(temp);
   }
}