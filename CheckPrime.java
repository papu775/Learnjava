import java.util.Scanner;
public class CheckPrime{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = input.nextInt();
      int flage = 0;
      for(int i=2;i*i<=number;i++){
           if(number%i==0){
               flage = 1;
               break;
           }
      }
   if(number !=1){
     if(flage==0){
         System.out.print("Prime");
     }else{
         System.out.print("Not Prime");
     }
   }else{
        System.out.print("Not calculate");
   }
   }
}