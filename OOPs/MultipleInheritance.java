interface A{
	void decide();
}
interface P1 extends A{			// interface to interface extends
	void decide();
}
interface P2 extends A{
	void decide();
}
class B implements P1,P2{
	public void decide(){
		System.out.println("Tuli..");
	}
}

class MultipleInheritance{
	public static void main(String[] args) {
		/*A a =new P2();		// Up cast
		a.decide();*/
		
		A a =new B();
		a.decide();		//


	}
}