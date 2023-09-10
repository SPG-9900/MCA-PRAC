class TestStudent3{  
public static void main(String args[]){    
  Student s1=new Student();  
  Student s2=new Student();  
  s1.id=60;  
  s1.name="karan";  
  s2.id=46;  
  s2.name="khushal";  
  System.out.println(s1.id+" "+s1.name);  
  System.out.println(s2.id+" "+s2.name);  
 }  
}  
class Student{  
 int id;  
 String name;  
}  