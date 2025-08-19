import java.util.Scanner;
import java.lang.*;

public class PermutationOfNumArray
{
   public static void main(String[] args)
  {
    int n,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER LENGTH OF ARRAY");
    n=sc.nextInt();

    int[] ar=new int[n];

    System.out.println("ENTER ARRAY ELEMENTS");
    for(i=0;i<n;i++)
      {
        ar[i]=sc.nextInt();
      }

    permute(ar,0,n-1);

  }

  static void permute(int[] a,int l,int r)
    {
      if(l==r)
      {
         for(int i=0;i<r+1;i++)
         {
             System.out.print(a[i]+" ");
         }
          System.out.println(" ");
      }

      else
      {
        for(int i=l;i<=r;i++)
        {
          swap(a,l,i);
          permute(a,l+1,r);
          swap(a,l,i);
        }
      }
    }

   static void swap(int[] a,int x,int y)
   {
     int temp=a[x];
     a[x]=a[y];
     a[y]=temp;
   }


}
