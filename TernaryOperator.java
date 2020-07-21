import java.util.Scanner;
public class TernaryOperator{
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter your age: ");
         int age = input.nextInt();
         String voteAble = (age>=18)? "You are able to vote participate":"You are not able to able vote participate";
         System.out.print(voteAble);
     }
}