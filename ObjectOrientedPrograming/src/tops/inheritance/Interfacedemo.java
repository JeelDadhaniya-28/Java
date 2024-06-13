package tops.inheritance;

public class Interfacedemo implements ifs2 {
	public static void main(String[] args) {
		ifs1.meth1();
		
		Interfacedemo i=new Interfacedemo();
		i.meth2();
	}

	public void meth2() {
		System.out.println("Meth2");
	}
}

interface ifs1{
	static void meth1() {
		System.out.println("Meth1 define from Interface.");
	}
}

interface ifs2 extends ifs1{
	void meth2();
}