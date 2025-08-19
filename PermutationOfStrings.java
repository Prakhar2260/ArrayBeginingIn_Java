import java.util.*;
import java.lang.String;
import java.util.Scanner;

public class PermutationOfStrings
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER STRING WHOSE PERMUTATIONS YOU WANT\n");
    String str=sc.next();

    permute(str," ");

  }

   static void permute(String s,String p)
  {
    if(s.length()==0)
    {
      System.out.println(p);
      return;
    }
     char ch;
     String remain="";
    for(int i=0;i<s.length();i++)
       {
         ch=s.charAt(i);
         remain=(s.substring(0,i))+(s.substring(i+1));
         permute(remain,p+ch);
       }
  }

}
