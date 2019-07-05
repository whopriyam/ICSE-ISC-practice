// Java program to check if a number is Magic number. 
// A number is said to be a magic number, if the sum of its digits are calculated till a single digit recursively by
// adding the sum of the digits after every addition. If the single digit comes out to be 1,then the number is a magic number.

class Magic
{ 
   public static boolean isMagic(int n) 
   { 
       int sum = 0; 
       
       // Note that the loop continues  
       // if n is 0 and sum is non-zero. 
       // It stops when n becomes 0 and 
       // sum becomes single digit. 
       while (n > 0 || sum > 9) 
       { 
           if (n == 0) 
           { 
               n = sum; 
               sum = 0; 
           } 
           sum += n % 10; 
           n /= 10; 
       } 
       
       // Return true if sum becomes 1. 
       return (sum == 1); 
   } 
    
   // Driver code 
   public static void main(String args[]) 
    { 
     int n = 1234; 
     if (isMagic(n)) 
        System.out.println("Magic Number"); 
           
     else
        System.out.println("Not a magic Number"); 
    } 
} 
