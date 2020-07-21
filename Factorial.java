import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int fact = 1;
        int result = 0;
        if(number == 0){
           result = 1;
        }else{
           for(int i=number;i>1;i--){
                fact *=i;
           }
           result = fact;
        }
       System.out.printf("%d factorial is: %d",number,result);
    }
}