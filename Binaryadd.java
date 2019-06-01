//Program to add two binary numbers and print the sum
import java.util.*;
class BinaryAddition
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int k=0;
        int copy1=a;
        int copy2=b;
        int c1=0,c2=0;
        while(copy1!=0)
        {
            c1++;
            copy1/=10;
        }
        while(copy2!=0)
        {
            c2++;
            copy2/=10;
        }
        int z=0;
        if(c1>c2)
        z=c1;
        else z=c2;
       
        copy1=a;
        copy2=b;
        int p[]= new int[z];
        int a1[]= new int[z];
        int b1[]= new int[z];
        int q=z;
        while(copy1!=0)
        {
            int d=copy1%10;
            a1[--q]=d;
            copy1/=10;
        }
        q=z;
        while(copy2!=0)
        {
            int d=copy2%10;
            b1[--q]=d;
            copy2/=10;
        }
        int r[]= new int[z+1];
        int w=z;
        for(int i=z-1; i>=0; i--)
        {
            int s=a1[i]+b1[i]+k;
            if(s==0)
            {
                r[w--]=0;
                k=0;
            }
            else if(s==1)
            {
                r[w--]=1;
                k=0;
            }
            else if(s==2)
            {
                r[w--]=0;
                k=1;
            }
            else if(s==3)
            {
                r[w--]=1;
                k=1;
            }
        }
        r[0]=k;
        if(r[0]==1)
        {
        for(int i=0; i<=z; i++)
        {
            System.out.print(r[i]);
        }
    }
    else 
    for(int i=1; i<=z; i++)
        {
            System.out.print(r[i]);
        }
        System.out.println("\n");
    }
}
