import java.lang.*;
import java.util.Scanner;

public class TwoDArray
{
   public static void main(String []args)
   {
     int n,m;
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER ARRAY ROWS");
    n=sc.nextInt();
    System.out.println("ENTER ARRAY COLUMNS");
    m=sc.nextInt();

    int [][]ar=new int[n][m];

    System.out.println("ENTER ARRAY ELEMENTS");
    for(int i=0;i<n;i++)
      {
       for(int j=0;j<m;j++)
         {
           ar[i][j]=sc.nextInt();
         }
      }

       System.out.println("ENTERED ARRAY IS AS FOLLOWS");
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
             System.out.print(ar[i][j]+" ");
           }
           System.out.println("");
       }
   }
}
