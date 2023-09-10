
import java.io.*;
import java.util.*;

public class Methods 

{
	public static void main(String args[]) throws Exception
	{
		FileWriter fw= new FileWriter("ABC.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name");
		String name=sc.next();
		System.out.println("Enter Student Marks");
		int marks=sc.nextInt();
		System.out.println("Enter Student Class");
		String std=sc.next();
		fw.write("Name:"+name);
		fw.write("\nMarks:"+marks);
		fw.write("\nClass:"+std);
		fw.close();
		
		int ch,n=0;
		FileReader fr=new FileReader("ABC.txt");
		while((ch=fr.read())!=-1)
		{
		  System.out.print((char)ch);
		  n++;
		}

		System.out.println(n);
		fr.close();
	}
}