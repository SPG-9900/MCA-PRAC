class TestStudent4{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.insertRecord(60,"karan");
s2.insertRecord(48,"akashy");
s1.displayInformation();
s2.displayInformation();
}
} class Student{
int rollno;
String name;
void insertRecord(int r, String n){
rollno=r;
name=n;
}
void displayInformation()
{
System.out.println(rollno+"\n"+name);
}
}