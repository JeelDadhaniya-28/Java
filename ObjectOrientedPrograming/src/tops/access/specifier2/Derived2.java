package tops.access.specifier2;

import tops.access.specifier1.Protection;

public class Derived2 extends Protection{
	public Derived2() {
		System.out.println("Derived's Constructor.");
//		System.out.println("n :"+n);
		System.out.println("n_pub :"+n_pub);
//		System.out.println("n_pri :"+n_pri);
		System.out.println("n_pro :"+n_pro);
	}
}
