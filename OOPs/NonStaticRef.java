class Dummy{		
	int i=10;
	void m1(){		
		System.out.println("m1 method...");
		
	}
}
class Summy{		
	int j=20;
	Dummy dum= new Dummy();

	void m2(){
		dum.m1();
		System.out.println("m2 Method...");
	}
}
class NonStaticRef{	
	public static void main(String[] args) {
		Summy sum= new Summy();
		System.out.println(sum.j);
		sum.m2();

		/*System.out.println(sum.dum.i);
		sum.dum.m1();*/
		

		
	}
}