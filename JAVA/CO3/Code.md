### Course Outcome 3(CO3):
#### 1. Area of different shapes using overloaded functions.

```java
//writing same method with different parameters.

import java.util.*;

class Shape{
	void area(int l, int b){
		System.out.println("Area of rectangle:" + l*b);
	}
	void area(int a){
		System.out.println("Area of square:" + Math.pow(a,2));
	}

	void area (float r){
		System.out.println("Area of circle:" + 3.14*r*r);
	}

	void area (float br, float h){
		System.out.println("Area of triangle:" + .5*br*h);
	}
}

class h{
	public static void main(String[] args){
		int l,a,b;
		float r,br,h;

		Scanner s = new Scanner(System.in);
		Shape obj = new Shape();
		System.out.println("Enter the length and breadth:");
		l = s.nextInt();
		b = s.nextInt();
		obj.area(l,b);
		System.out.println("\n");

		System.out.println("Enter the side of square:");
		a = s.nextInt();
		obj.area(a);
		System.out.println("\n");

		System.out.println("Enter the radius:");
		r = s.nextInt();
		obj.area(r);
		System.out.println("\n");

		System.out.println("Enter the breadth and height");
		br = s.nextInt();
		h = s.nextInt();
		obj.area(br,h);
		System.out.println("\n");

	}
}

```

#### 2. Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to initialize the data members and another class ‘Employee’ that inherits the properties of class Person and also contains its own data members like Empid, Company_name, Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits the properties of class Employee and contains its own data members like Subject, Department, Teacherid and contain constructors and methods to display the data members. Use array of objects to display details of N teachers.

```java
// Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to initialize the data members and another class ‘Employee’ that inherits the properties of class Person and also contains its own data members like Empid, Company_name, Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits the properties of class Employee and contains its own data members like Subject, Department, Teacherid and contain constructors and methods to display the data members. Use array of objects to display details of N teachers.

import java.util.*;
class Person{
	String name;
	String gender;
	String address;
	int age;

	//constructor 
	Person(String na,String ga,String ad, int ag){
		this.name = na;
		this.gender = ga;
		this.address = ad;
		this.age = ag;
	}

}
//extends
class Employee extends Person{
	int empid;
	String company_name;
	String qualification;
	double salary;

	//constructor
	Employee(int id, String cmp_na, String qa, double sa, String na,String ga,String ad, int ag){
		super(na,ga,ad,ag);
		this.empid = id;
		this.company_name = cmp_na;
		this.qualification = qa;
		this.salary = sa;
	}
}

class Teacher extends Employee{
	String subject;
	String department;
	int teacherid;

	//constructor
	Teacher(String su,String de, int tid,int id, String cmp_na, String qa, double sa, String na,String ga,String ad, int ag)
	super(na,ga,ad,ag,id,cmp_na,qa,sa);
	this.subject = su;
	this.department = de;
	this.teacherid = tid;
}


//Display

void display(){
	System.out.println("The data members are:" + "\n" + "Name" + name + "\n" + "Gender" + gender + "\n" + "Address" + address + "\n" + "Age" + age + "\n" + "Employee_ID" + empid + "\n" + "Company Name" + company_name + "\n" + "Qualification" + qualification + "\n" + "Salary" + salary + "\n" + "Subject" + subject + "\n" + "Department" + department + "\n" + "Teacher_ID" + teacherid + "\n" )
}

class Main{
	public static void main(String[] args){
		String a,b,c,d,e,f,g;
		int h,i,j,k; 		//i for for loop
		double l;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		Teacher obj[] = new Teacher[n];
		for(i=0;i<n;i++){
			p=i+1;
			System.out.println("Enter the details of teacher" + p);
				a = s.nextInt();
			System.out.println("Enter the Name:");
				b = s.next();
			System.out.println("Enter the Gender:");
				c = s.next();
			System.out.println("Enter the Address:");
				d = s.next();
			System.out.println("Enter the Age:");
				h = s.nextInt();
			System.out.println("Enter the Employee ID:");
				e = s.nextInt()
			System.out.println("Enter the Company Name:");
				f = s.next()
			System.out.println("Enter the Salary:");
				j = s.nextInt()
			System.out.println("Enter the Subject:");

			System.out.println("Enter the Department:");

			System.out.println("Enter the Teacher ID:");



		}
	}
}

```




#### 3. Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle and Rectangle which implements the above interface. Create a menu driven program to find area and perimeter of objects.
