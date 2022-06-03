import java.util.*;
class Inheritance{
	static class Member{
		String id,name,mob,dob;
		int yy,dd,mm;
	}
	static class Faculty extends Member{
			float basic_salary;
			String department,designation;
			public void getDetails(){
				System.out.print("Enter the following details:\nName : ");
				name=(new Scanner(System.in)).nextLine();
				System.out.print("Designation : ");
				designation=(new Scanner(System.in)).nextLine();
				System.out.print("Department : ");
				department=(new Scanner(System.in)).nextLine();
				System.out.print("Id : ");
				id=(new Scanner(System.in)).nextLine();
				System.out.print("DOB(yyyy mm dd) : ");
				yy=(new Scanner(System.in)).nextInt();
				mm=(new Scanner(System.in)).nextInt();
				dd=(new Scanner(System.in)).nextInt();
				dob=(new Date(yy,mm,dd)).toString();
				//Date cur=new Date();
				System.out.print("Mobile no. : ");
				mob=(new Scanner(System.in)).nextLine();
				System.out.print("Basic Salary : ");
				basic_salary=(new Scanner(System.in)).nextFloat();

			}
			public void display(){
				System.out.print("The details of the member are as follows :\nName : ");
				System.out.println(name);
				//System.out.println("Age : :"+age);
				System.out.println("Designation : "+designation);
				System.out.println("Department : "+department);
				System.out.println("Id : "+id);
				System.out.println("Mobile no. : "+mob);
				System.out.println("DOB : "+dob);
				System.out.println("Basic salary : "+basic_salary);
			}
	}
	static class Staff extends Member{
			String department,designation;
			public void getDetails(){
				System.out.print("Enter the following details:\nName : ");
				name=(new Scanner(System.in)).nextLine();
				System.out.print("Designation : ");
				designation=(new Scanner(System.in)).nextLine();
				System.out.print("Department : ");
				department=(new Scanner(System.in)).nextLine();
				System.out.print("Id : ");
				id=(new Scanner(System.in)).nextLine();
				System.out.print("DOB(yyyy mm dd) : ");
				yy=(new Scanner(System.in)).nextInt();
				mm=(new Scanner(System.in)).nextInt();
				dd=(new Scanner(System.in)).nextInt();
				dob=(new Date(yy,mm,dd)).toString();
				System.out.print("Mobile no. : ");
				mob=(new Scanner(System.in)).nextLine();

			}
			public void display(){
				System.out.print("The details of the member are as follows :\nName : ");
				System.out.println(name);
				//System.out.println("Age : :"+age);
				System.out.println("Designation : "+designation);
				System.out.println("Department : "+department);
				System.out.println("Id : "+id);
				System.out.println("Mobile no. : "+mob);
				System.out.println("DOB : "+dob);
			}
	}
	static class Student extends Member{
			String department;
			public void getDetails(){
				System.out.print("Enter the following details:\nName : ");
				name=(new Scanner(System.in)).nextLine();
				System.out.print("Id : ");
				id=(new Scanner(System.in)).nextLine();
				System.out.print("Department : ");
				department=(new Scanner(System.in)).nextLine();
				System.out.print("DOB(yyyy mm dd) : ");
				yy=(new Scanner(System.in)).nextInt();
				mm=(new Scanner(System.in)).nextInt();
				dd=(new Scanner(System.in)).nextInt();
				dob=(new Date(yy,mm,dd)).toString();
				System.out.print("Mobile no. : ");
				mob=(new Scanner(System.in)).nextLine();

			}
			public void display(){
				System.out.print("The details of the member are as follows :\nName : ");
				System.out.println(name);
				//System.out.println("Age : :"+age);
				System.out.println("Department : "+department);
				System.out.println("Id : "+id);
				System.out.println("Mobile no. : "+mob);
				System.out.println("DOB : "+dob);
			}
	}
	static class Exam extends Student{
		String subjects[]=new String[5];
	}
	public static void main(String args[]){
		System.out.println("Enter: \n1 for Faculty \n2 for Staff \n3 for Student");
		int n=(new Scanner(System.in)).nextInt();
		switch(n){
			case 1:
				Faculty f = new Faculty();
				f.getDetails();
				f.display();
				break;
			case 2:
				Staff m = new Staff();
				m.getDetails();
				m.display();
				break;
			case 3:
				Student s = new Student();
				s.getDetails();
				s.display();
				break;
		}
	}
};
