import java.util.Scanner;
class Calculator{
     static String calculate(double firstNumber,double secondNumber,char operator){
            switch(operator){
                  case '+':
                     return Double.toString(firstNumber +secondNumber);
                  case '-':
                     return Double.toString(firstNumber -secondNumber);
                  case '*':
                     return Double.toString(firstNumber *secondNumber);
                  case '/':
                     return Double.toString((double)firstNumber /(double)secondNumber);
                  default:
                     return "Do Not Match operator";
            }
     }
}
public class SwitchCase{
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         Calculator calc = new Calculator();
         System.out.print("Enter first number: ");
         double firstNumber = input.nextDouble();
         System.out.print("Enter second number: ");
         double secondNumber = input.nextDouble();  
         System.out.print("Enter operator(+,-,*,/): ");
         char op = input.next().charAt(0);
         System.out.println("Result is: "+calc.calculate(firstNumber,secondNumber,op));      
     }
}