class Dummy{		// PrintStream	Engine
	int i=10;
	void m1(){		// println()
		System.out.println("m1 method...");
		System.out.println("hii");
	}
}
class Summy{		// System	 Car
	static int j=20;

	static Dummy dum= new Dummy();
//	static PrintStream out= new PrintStream();

	static void m2(){
		System.out.println("m2 Method...");
	}
}


class StaticRef{	
	public static void main(String[] args) {
		System.out.println(Summy.j);	//20
		Summy.m2();

		System.out.println(Summy.dum.i);	//10
		Summy.dum.m1();
	//	System.out.println();

		

		
	}
}