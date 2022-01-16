package phase1.assisted_practice.interfaces_and_collections;

public class Student {
	String name;
	int age;
	char section;
	char gender;
	int subject1;
	int subject2;
	int subject3;
	
	Student(String n, int a, char s, char g, int s1, int s2, int s3)  //constuctor
	{
		name = n;
		age = a;
		section = s;
		gender = g;
		subject1 = s1;
		subject2 = s2;
		subject3 = s3;
	}
	public int marks(){
		return subject1+subject2+subject3;
	}
	public float percentage(){
		return (marks()*100)/300;
	}
	public static void main(String[] args) {
		Student s1 = new Student("Abhishek", 23, 'A','M', 86,74,91);//Parameterised constructor
		Student s2 = new Student("Mahesh", 23, 'B','M', 44,65,73);
		Student s3 = new Student("Praveen", 24, 'A','M', 66,99,59);
		Student s4 = new Student("Soumya", 25, 'B','F', 99,98,93);
		
		System.out.println("Marks of student s1 "+ s1.marks() + " Percentage of student s1 " + s1.percentage());
		System.out.println("Marks of student s2 "+ s2.marks() + " Percentage of student s2 " + s2.percentage());
		System.out.println("Marks of student s3 "+ s3.marks() + " Percentage of student s3 " + s3.percentage());
		System.out.println("Marks of student s4 "+ s4.marks() + " Percentage of student s4 " + s4.percentage());
		
	}

}
