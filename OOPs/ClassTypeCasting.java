class SuperClass{
	void m1(){
		System.out.println("m1 method");
	}
}
class SubClass extends SuperClass{
	void m2(){
		System.out.println("m2 method");
	}
}

class ClassTypeCasting{
	public static void main(String[] args) {
		SuperClass sup = new SubClass();	// Up cast
		sup.m1();
		
		SubClass sub=(SubClass)sup;		// Down Cast
		sub.m1();
		sub.m2();




	}
}