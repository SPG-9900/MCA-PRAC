class Bike2 extends Vehicle2
{
void run()
{
System.out.println("Bike is running safely");
}
public static void main(String args[])
{
Bike2 obj= new Bike2();
obj.run();
}
}
class Vehicle2
{
void run()
{
System.out.println("Vehicle is running");
}
}