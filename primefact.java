import java.io.*;
import java.util.*;
class primefact
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a+1;i<b;i++)
        {
            if(i>2)
            {
                if((i%2!=0)&&(i%3!=0))
                {
            
                    System.out.print(i);
                }
            }
        }
    }
}
