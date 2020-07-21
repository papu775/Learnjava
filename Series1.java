import java.util.Scanner;
public class Series1{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int number = input.nextInt();
       float temp = 0;
       for(int i=1;i<=number;i++){
             if(i%2==0){
                 temp = temp - (1/(float)i);
             }else{
                 temp = temp + (1/(float)i);
             }
       }
      System.out.println(temp);
      
    }
}