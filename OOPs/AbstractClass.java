abstract class Demo{
	static int i=10;
	int j=20;
	Demo(){
		System.out.println("Demo Constructor..");
	}
	static void m(){		// concrete method
		System.out.println("m method..");
	}
	void m1(){		// concrete method
		System.out.println("M1 method..");
	}
	abstract void m2();		// abstract method
}
class DemoImpl extends Demo{
	DemoImpl(){
		System.out.println("DemoImpl Constructor");
	}
	void m2(){
		System.out.println("m2 method...");
	}
}
class AbstractClass{
	public static void main(String[] args) {
		System.out.println(Demo.i);		// 10
		Demo.m();
		Demo d= new DemoImpl();			// up casting
		System.out.println(d.j);
		d.m1();
		d.m2();

		
	}
}