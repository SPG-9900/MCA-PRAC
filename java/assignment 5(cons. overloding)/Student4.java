import java.util.Scanner;
class Student4
{
	int id;
	String name;
	int age;

	Student4(int i,String n)
	{
		id=i;
		name=n;
	}
	Student4(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age+'\n');
	}

	public static void main(String[] args)
	{
		String Sname;
		int Sid,Sage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID of student");
		Sid=sc.nextInt();
		System.out.println("Enter name of student");
		Sname=sc.next();
		Student4 s1=new Student4(Sid,Sname);
		
		System.out.println("Enter ID of student");
		Sid=sc.nextInt();
		System.out.println("Enter name of student");
		Sname=sc.next();
		System.out.println("Enter age of student");
		Sage=sc.nextInt();
		Student4 s2=new Student4(Sid,Sname,Sage);
		
		s1.display();
		s2.display();
	}
}