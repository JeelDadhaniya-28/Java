package tops.access.specifier2;

import tops.access.specifier1.Protection;

public class NonDerived2 {
	public NonDerived2() {
		Protection p=new Protection();
		System.out.println("NonDerived's Constructor.");
//		System.out.println("n :"+p.n);
		System.out.println("n_pub :"+p.n_pub);
//		System.out.println("n_pri :"+p.n_pri);
//		System.out.println("n_pro :"+p.n_pro);
	}
}
