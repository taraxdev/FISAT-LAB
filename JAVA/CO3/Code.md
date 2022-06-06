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
#### 3. Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle and Rectangle which implements the above interface. Create a menu driven program to find area and perimeter of objects.
