import java.util.Scanner;
public class NumberSum{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int no = sc.nextInt();
       int temp = no;
       int sum = 0;
       while(temp>0){
          sum += temp%10;
          temp /= 10;
       }
      System.out.print("Addition of two number is: "+sum);
    }
}