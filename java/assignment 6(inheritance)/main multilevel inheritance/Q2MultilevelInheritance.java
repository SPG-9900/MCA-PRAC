//Assignment 8 
//Q2) Implement Multilevel inheritance. 
class Q2MultilevelInheritance {
	public static void main(String args[]) {
		Sem4 s4=new Sem4();
		System.out.println("Semester 1 avg = "+s4.avg);
		System.out.println("Semester 2 avg = "+s4.avg1);
		System.out.println("Semester 3 avg = "+s4.avg2);
		System.out.println("Semester 4 avg = "+s4.avg3);
		System.out.println("Total Avg is = "+s4.totalavg());
	}
}
class Sem1 {
	int m11,m12,m13,m14,avg;
	Sem1() {
		m11=95;
		m12=93;
		m13=88;
		m14=90;
		avg=(m11+m12+m13+m14)/4;
	}
}
class Sem2 extends Sem1 {
	int m21,m22,m23,m24,avg1;
	Sem2() {
		m21=89;
		m22=98;
		m23=97;
		m24=79;
		avg1=(m21+m22+m23+m24)/4;
	}
}
class Sem3 extends Sem2 {
	int m31,m32,m33,m34,avg2;
	Sem3() {
		m31=87;
		m32=78;
		m33=88;
		m34=96;
		avg2=(m31+m32+m33+m34)/4;
	}
}
class Sem4 extends Sem3 {
	int m41,m42,m43,m44,avg3;
	Sem4() {
		m41=79;
		m42=90;
		m43=77;
		m44=96;
		avg3=(m41+m42+m43+m44)/4;
	}
	int totalavg() {
		return(avg+avg1+avg2+avg3)/4;
	} 
}