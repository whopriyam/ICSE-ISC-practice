#Program in Java to input a number in Decimal number system and convert it into its equivalent number in the 
#Octal number system.

import java.io.*;
class Dec2Oct
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter a decimal number : ");
        int n=Integer.parseInt(br.readLine());
 
        int r;
        String s=""; //variable for storing the result
 
        //array storing the digits (as characters) in the octal number system
        char dig[]={'0','1','2','3','4','5','6','7'};
 
        while(n>0)
            {
                r=n%8; //finding remainder by dividing the number by 8
                s=dig[r]+s; //adding the remainder to the result and reversing at the same time
                n=n/8;
            }
        System.out.println("Output = "+s);
    }
}
