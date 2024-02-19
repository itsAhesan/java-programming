class A{	
	int i;
	A(int i){
		this.i=i;
		System.out.println("A constructor");
	}
}
class B extends A{	
	int j;	
	B(int j){
		super(10);
		this.j=j;
		System.out.println("B constructor");
	}
}
class C extends B{	
	int k;	
	C(int k){
		super(20);
		this.k=k;
		System.out.println("C constructor");
	}
}
class ConstructorChaining{
	public static void main(String[] args) {
		C c =new C(30);
		System.out.println(c.i);
		System.out.println(c.j);
		System.out.println(c.k);
		
		
	}
}