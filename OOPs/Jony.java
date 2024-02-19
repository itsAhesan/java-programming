class Nikita{
	String name;
	int phone;
	String address;
	Nikita(String n, int p, String a){
		name=n;
		phone=p;
		address=a;
	}
}
class Rittika{	// called
	static void girlDetails(){		//  static , void --> need not return anything
		System.out.println("Name of the Girl Tuli");
		System.out.println("Name of the father Gopal ");
		System.out.println("Student");
	}
	static long getNumber(){ 		//  static , primitive --> return one value
		System.out.println("Number is 994477221");
		return 994477221L;
	}
	static long[] girlNumbers(){	//  static , array --> return multiple value
		System.out.println(" Rittika shares multiple phone numbers");
		long[] nums= {773311765L, 669977554L, 889966221L};
		return nums;
	}
	static Nikita getDetails(){  	// static, class as a return type, with multiple value but diff DataType
		Nikita nik= new Nikita("Nikita", 658888, "SLG");
		return nik;
	}
}
class Jony{   // caller
	public static void main(String[] args) {
		Rittika.girlDetails();

		long phoneNum =Rittika.getNumber();    // 994477221
		System.out.println("Dialing "+phoneNum); 

		long[] girls =Rittika.girlNumbers();  	// {773311765L, 669977554L, 889966221L}
		for (int i=0; i<girls.length ; i++) {
			System.out.println("Dialing numbers "+girls[i]);
		}
		Nikita g = Rittika.getDetails(); 
		System.out.println(g.name);
		System.out.println(g.address);
		System.out.println(g.phone);



	}
}