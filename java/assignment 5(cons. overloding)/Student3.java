//write a java program for const. overloading

class Student3{
	int id;
	String name;
	int age;
	
	Student3(int i,String n){
	id = i;
	name = n;
	}

	Student3(int i, String n, int a){
	id=i;
	name=n;
	age=a;
	}
	
	void display(){System.out.println(id+" "+name+" "+age);}
	
	public static void main(String args[]){
		Student3 s1 = new Student3(111,"Karan");
		Student3 s2 = new Student3(112,"Aryan",22);
		s1.display();
		s2.display();
	           }
	}

	