class Dinga{
	int i=10;
	void m1(){
		System.out.println("m1 method of Dinga..");
	}
}
class Linga extends Dinga{
	int i=20;
	void m1(){
		System.out.println("m1 method of Linga..");
		System.out.println(super.i);	//10
		super.m1();	
	}
}
class SuperKeyword{
	public static void main(String[] args) {
		Linga lin=new Linga();

		System.out.println(lin.i);	//20
		lin.m1();

		
		
	}
}