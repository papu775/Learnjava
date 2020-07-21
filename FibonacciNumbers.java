import java.util.Scanner;
public class FibonacciNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 0;
        for(int i=1;i<=number;i++){
          if(i==1){
              System.out.println(0);
          }else if(i==2){
              System.out.println(1);
          }else{
              nextNumber = firstNumber +secondNumber;
              System.out.println(nextNumber);
              firstNumber = secondNumber;
              secondNumber = nextNumber;
          }
        }
    }
}