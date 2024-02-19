class Calculator{
	static void add(int n1, int n2){
		int res= n1+n2;
		System.out.println(res);

	}
	static void add(double n1, double n2){
		double res=n1+n2;
		System.out.println(res);

	}
	static void add(int n1, int n2, int n3){
		int res= n1+n2+n3;
		System.out.println(res);

	}
	static void add(int n1, int n2, int n3, int n4){
		int res= n1+n2+n3+n4;
		System.out.println(res);

	}
	

}
class Test{   // Sayak
	public static void main(String[] args) {
		Calculator.add(10, 30 );      			// Rittika
		Calculator.add(10.11,20.12);
		Calculator.add(10, 20, 30);		   // Jony-----add(),add2()
		Calculator.add(10, 20, 30, 40);	  //  Tuli ----add(),add1()

	

	}
}