import java.util.Scanner;
public class Series{
    public static void main(String[] args){
          Scanner input = new Scanner(System.in);
          int number = input.nextInt();
          float temp = 0f;
          for(int i=1;i<=number;i++){
              temp +=(1/(float)i);
          }
        System.out.print(temp);
    }
}