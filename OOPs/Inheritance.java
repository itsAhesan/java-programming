class A{		// Parent or super class 	// Dadaji
	int i=10;
	void m1(){
		System.out.println("m1 method..");
	}
}
class B extends A{		// child or sub class  	// Pitaji
	int j=20;
	void m2(){
		System.out.println("m2  method..");
	}
	
}
class C extends A{		// child class 		// Uncle
	int k=30;
	void m3(){
		System.out.println("m3 method..");
	}
}
class Inheritance{
	public static void main(String[] args) {
		C c= new C();
		System.out.println(c.i);
		c.m1();

		B b= new B();
		System.out.println(b.i);
		b.m1();
		
	}
}