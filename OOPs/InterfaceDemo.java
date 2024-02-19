interface Demo{
	static int i=10;
	int j=20;			// static, final , public

	public abstract void m1();

	void m2();		// abstract, public
}
class DemoImpl implements Demo{
	public void m1(){
		System.out.println("M1 method..");
	}
	public void m2(){
		System.out.println("M2 method......");
	}
}
class InterfaceDemo{
	public static void main(String[] args) {
		System.out.println(Demo.i);		// 10

		System.out.println(Demo.j);		//20
		
		DemoImpl d= new DemoImpl();
		d.m1();
		d.m2();

	}
}