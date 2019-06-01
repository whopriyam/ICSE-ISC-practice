//Program to take an amount as input and print the denominations of currency.
//Eg: Input-1070 Output- 1000-1 10-7
import java.util.*;
class Currency
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an amount");
        int n= sc. nextInt();
        int a= n/2000;
        if(a>=1)
        System.out.println("2000-"+a);
        int b= n%2000;
        int c=b/500; 
        if(c>=1)
        System.out.println("500-"+c);
        int d=b%500;
        int e=d/100;
        if(e>=1)
        System.out.println("100-"+e);
        int f=d%100;
        int g=f/50;
        if(g>=1)
        System.out.println("50-"+g);
        int h=f%50;
        int i=h/10;
        if(i>=1)
        System.out.println("10-"+i);
        int j=h%10;
        int k=j/5;
        if(k>=1)
        System.out.println("5-"+k);
        int l= j%5;
        int m= l/2;
        if(m>=1)
        System.out.println("2-"+m);
        int o= l%2;
        int p= o/1;
        if(p>=1)
        System.out.println("1-"+p);
    }
    
}
        
