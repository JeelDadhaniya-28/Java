package tops.inheritance;

import java.util.Scanner;

public class InheritanceDemo {
	public static void main(String[] args) {
		hero h1=new hero();
		h1.chain();
		h1.folt();
		h1.speed();
		
//		a a1=new a();
//		b b1=new b();
		c c1=new c();
		c1.get();
		c1.post();
//		d d1=new d();
		
	}
}


  
  
  
//  Hierarchy 
  
  class a{
	  
	  a(){
		  System.out.println("Defoult const call from A");
	  }
	  
	  int a;
	  void get() {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter a:");
		  a=sc.nextInt();
		  
		  sc.close();
	  }
	  void post() {
		  System.out.println("a="+a);
	  }
  }
  
  class b extends a{
	  
	  b(){
		  System.out.println("Defoult const call from B");
	  }
	  
	  int b;
	  void getB() {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter b:");
		  b=sc.nextInt();
		  
		  sc.close();		  
	  }
	  void postB() {
		  System.out.println("b="+b);
	  }
  }
 
  class c extends a{
	  
	  c(){
		  System.out.println("Defoult const call from C");
	  }
	  
	  int c;
	  void get() {
		  Scanner sc=new Scanner(System.in);
		  super.get();
		  System.out.print("Enter c:");
		  c=sc.nextInt();
		  
		  sc.close();
	  }
	  void post() {
		  super.post();
		  System.out.println("c="+c);
	  }
  }
  
  class d extends a{
	  
	  d(){
		  System.out.println("Defoult const call from D");
	  }
	  
	  int d;
	  void getD() {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter d:");
		  d=sc.nextInt();
		  
		  sc.close();
	  }
	  void postD() {
		  System.out.println("d="+d);
	  }
  }
  
  
  
  
  
  
  
  

abstract class Vahical{
	abstract void tire();
	
	abstract void speed();
	
	abstract void light();
}

class car extends Vahical{
	void tire() {
		System.out.println("Car have a Morthan Equal 4 Tire");
	}
	
	void speed() {
		System.out.println("Car Speed achive Morethan 110 km/hr");
	}
	
	void light() {
		System.out.println("Car have a Morthann Equal 2 light.");
	}
	
	void folt() {
		System.out.println("Car have no damage and folt.");
	}
}

class bick extends car{
	void tire() {
		System.out.println("Bick have a 2 Tire");
	}
	
	void speed() {
		System.out.println("Bick Speed achive Morethan 90 km/hr");
	}
	
	void light() {
		System.out.println("Bick have a 1 light.");
	}
	
	void chain() {
		System.out.println("Bick chain is very strong.");
	}
}


  class hero extends bick{ 
	  void tire() { 
		  System.out.println("Hero Bick provide best service after market. Specialy tire"); 
	  }
  
	  void speed() {
		  super.speed();
		  System.out.println("Hero Bick Speed achive Morethan 100 km/hr");
	  }
  
	  void light() {
		  System.out.println("Hero Bick give you 1 light."); 
	  }
	  
	  void service(){
		  System.out.println("Hero provide service in after 3 months in 1year.");
  }
}