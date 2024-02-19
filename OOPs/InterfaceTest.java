interface DemoInterface{
	static int i=10;		// by default staic,final, public


	public abstract void m1();
	void m2();			// by default public, abstract

}
class DemoImpl implements DemoInterface{
	public void m1(){
		System.out.println("m1 method..");
	}
	public void m2(){
		System.out.println("M2 method..");
	}
}

class InterfaceTest{
	public static void main(String[] args) {
		System.out.println(DemoInterface.i);		//10

		DemoImpl d= new DemoImpl();
		d.m1();
		d.m2();

	}
}