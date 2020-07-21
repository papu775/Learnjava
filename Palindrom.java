import java.util.Scanner;
public class Palindrom{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int no = sc.nextInt();
         int temp = no;
         int rev = 0;
         while(temp>0){
           rev = rev*10+(temp%10);
           temp /=10;
         }
       if(no==rev){
         System.out.print("Palindrom");
       } else{
         System.out.print("Not Palindrom ");
       }
    }
}