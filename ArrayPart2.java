import java.util.Scanner;
public class ArrayPart2{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number of student: ");
         int n = Integer.parseInt(sc.nextLine());
         String[] name = new String[n];
         System.out.println("Enter student name: ");
         for(int i=0;i<name.length;i++){
              name[i] = sc.nextLine();
         }
        System.out.print("Name of the student is: ");
        for(int i=0;i<name.length;i++){
            System.out.printf("\n%d. %s",i+1,name[i]);
        }
     }
}