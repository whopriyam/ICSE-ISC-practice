//Program to print all numbers between two limits that are prime and palindrome(i.e. Same number when looked backwards)
import java.util.*;
class PrimePalindrome
{
     public static void main(String[] args)
    { 
        int p=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limits");
        int m= sc.nextInt();
        int n=sc.nextInt();
        int x[]= new int[(n-m)];
        System.out.println("THE PRIME PALINDROME INTEGERS ARE:");
        for(int i=m; i<=n; i++)
        { int c=0;
            for(int j=2; j<=(i/2); j++)
            {
                if(i%j==0)
                c++;
            }
            if(c==0)
            { int s=0;
                int copy=i;
                while(copy!=0)
                {
                    int b= copy%10;
                    s= (s*10)+b;
                    copy/=10;
                }
                if(s==i)
                {   
                    
                    x[p]= i;
                    p++;
            }
        }
    }
    for(int l=0; l<(p-1); l++)
    {System.out.print(x[l]+" , ");}
     System.out.print(x[(p-1)]);
     System.out.println("\n"+"FREQUENCY OF PRIME PALINDROME NUMBERS ARE: "+p);
        }
}


