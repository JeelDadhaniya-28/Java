package tops.interfacetype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo implements Comparator<Emp>{
	
	
	public static void main(String[] args) {
		ArrayList<Emp> list=new ArrayList<Emp>();
		Emp e1=new  Emp();
		e1.setEid(1);
		e1.setEname("Jeel Dadhaniya");
		e1.setSalary(20000);
		
		Emp e2=new  Emp();
		e2.setEid(2);
		e2.setEname("Avan Vadariya");
		e2.setSalary(25000);
		
		Emp e3=new  Emp();
		e3.setEid(3);
		e3.setEname("krensi Hadavani");
		e3.setSalary(30000);
		
		Emp e4=new  Emp();
		e4.setEid(4);
		e4.setEname("kensi Javiya");
		e4.setSalary(30000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list, new ComparatorDemo());
		for(Emp e:list) {
			System.out.println("EID :"+e.getEid()+" ENAME :"+e.getEname()+" SALARY :"+e.getSalary());
		}
	}
	

	public int compare(Emp e1, Emp e2) {
		
		int value = 0;
		if(e1.getSalary() > e2.getSalary()) {
			value = -1;
		}
		else if(e1.getSalary() < e2.getSalary()) {
			value = 1;
		}
		else if(e1.getSalary() == e2.getSalary()) {
			value = 0;
		}
		return value;
	}	
}
