package letmecalculate;

public class Calculator1 {
   public int add(int a, int b){
	return a+b;
   }
   public static void main(String args[]){
	Calculator1 obj = new Calculator1();
	System.out.println(obj.add(10, 20));
   }
}