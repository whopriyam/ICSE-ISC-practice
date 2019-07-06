#Program in Java to input a number in Decimal number system and convert it into its equivalent number in the 
#Binary number system.

import java.io.*;
class Dec2Bin
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter a decimal number : ");
        int n=Integer.parseInt(br.readLine());
 
        int r;
        String s=""; //variable for storing the result
 
        char dig[]={'0','1'}; //array storing the digits (as characters) in a binary number system
 
        while(n>0)
            {
                r=n%2; //finding remainder by dividing the number by 2
                s=dig[r]+s; //adding the remainder to the result and reversing at the same time
                n=n/2;
            }
        System.out.println("Output = "+s);
    }
}
