package tops.inheritance;

public class ThisDemo {

	public static void main(String[] args) {
		Student s1=new Student(1,"jk");
		s1.show(s1);
//		s1.display();
	}
}



class Student{
	int rno;
	String name;
		
	public Student(int rno, String name) {
		this();
		System.out.println("Para constructor Call.");
		this.rno=rno;
		this.name=name;
	}
	
	public Student() {
//		this(1,"jeel"); //(when you call this para method, then comment this defount constructor)
		System.out.println("Defoult Constructor Call.");
	}
	
	void show(Student s) {
		System.out.println("Roll no:"+s.rno);
		System.out.println("Name :"+s.name);
	}
	
//	void display() {
//		show(this); //(it is use to call same method in same class)
//	}
		
	
//	-----You also use this type of this method-----
	
	
//	void show(int rno,  String name) {
//		System.out.println("Roll no:"+rno);
//		System.out.println("Name :"+name);
//	}
	
//	void display() {
//		show(this.rno, this.name); 
//	}
}
