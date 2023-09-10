// class Factorial
// {  
//  public static void main(String args[])
// {  
//   int i,fact=1;  
//   int number=6;    
//   for(i=1;i<=number;i++)
// {    
//       fact=fact*i;    
// }    
//   System.out.println("Factorial of "+number+" is: "+fact);    
// }  
// }



import java.util.*;
class Factorial
{
public static void main(String[] args)
{
int i,fact=1,n;
Scanner sc = new Scanner(System.in);
System.out.println(" enter the number: ");
n =sc.nextInt();
for (i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("fcatorial of number "+n+" is "+fact);
}
}