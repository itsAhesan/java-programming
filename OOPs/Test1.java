class P1{
	P1(String name){
		System.out.println("P1 Contructor..");
	}
}
class P2{
	P2(String name){
		System.out.println("P2 Contructor..");
	}
}
class Child extends P1,P2{
	Child(String name){
		super(name)

	}
}

class Test1{
	public static void main(String[] args) {
		new Child("Anita");

	}
}