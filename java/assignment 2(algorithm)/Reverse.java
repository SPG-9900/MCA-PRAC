import java.util.Scanner;

public class Reverse{
      public static void main(String[] args){
	  Scanner in = new Scanner(System.in);
	  int num = in.nextInt();
	  
	  int rev = 0, rem ;
	  
	  while ( num != 0){
		  rem = num % 10;
		  rev = rev * 10 + rem;
          num = num / 10;		  
	  }
	  System.out.println("Reverse number is " + rev);
	  } 
}
