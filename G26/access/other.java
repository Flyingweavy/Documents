package pack1;

public class other {
base b1=new base();
other()
{System.out.println("\nin the other class");
	System.out.println("the public member is"+b1.a);
	//System.out.println("the private member is"+c);
	System.out.println("the protected member is"+b1.b);
	System.out.println("the default member is"+b1.d);
}
}

