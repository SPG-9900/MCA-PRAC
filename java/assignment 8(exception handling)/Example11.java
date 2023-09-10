public class Example11{
void checkAge(int age){
if(age<18)
 throw new ArithmeticException("Not Eligible for voting");
else
 System.out.println("Eligible for voting");
}
public static void main(String args[]){
Example11 obj = new Example11();
obj.checkAge(12);
System.out.println("End Of Program");
} }