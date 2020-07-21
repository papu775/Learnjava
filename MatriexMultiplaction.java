import java.util.Scanner;
public class MatriexMultiplaction{
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int sum = 0;
           System.out.println("####1st Matriex####");
           System.out.print("Enter number of row: ");
           int row1 = sc.nextInt();
           System.out.print("Enter number of colum: ");
           int col1 = sc.nextInt();
           int[][] arr1 = new int[row1][col1];
           System.out.println("Enter Matriex element: ");
           for(int i=0;i<row1;i++){
              for(int j=0;j<col1;j++){
                  arr1[i][j] = sc.nextInt();
              }
           }
          System.out.println("-------1st Matriex-------");
          for(int i=0;i<row1;i++){
             for(int j=0;j<col1;j++){
                 System.out.print(arr1[i][j]+" ");
             }
            System.out.println();
          }

        System.out.println("####2nd Matriex####");
           System.out.print("Enter number of row: ");
           int row2 = sc.nextInt();
           System.out.print("Enter number of colum: ");
           int col2 = sc.nextInt();
           int[][] arr2 = new int[row2][col2];
           System.out.println("Enter Matriex element: ");
           for(int i=0;i<row2;i++){
              for(int j=0;j<col2;j++){
                  arr2[i][j] = sc.nextInt();
              }
           }
          System.out.println("-------2nd Matriex-------");
          for(int i=0;i<row2;i++){
             for(int j=0;j<col2;j++){
                 System.out.print(arr2[i][j]+" ");
             }
            System.out.println();
          }
         int[][] arr3 = new int[row1][col2]; 
         if(row1!=col2){
              System.out.print("Matriex Multiplaction not possible: ");
         }else{
              for(int i=0;i<row1;i++){
                 for(int j=0;j<col2;j++){
                    for(int k=0;k<row2;k++){
                        sum +=arr1[i][k] * arr2[k][j];
                    }
                    arr3[i][j] = sum;
                    sum = 0;
                 }
              }
            System.out.println("Restlt is: ");
            for(int i=0;i<row1;i++){
               for(int j=0;j<col2;j++){
                   System.out.print(arr3[i][j]+" ");
               }
              System.out.println();
            }
         }

       }
}