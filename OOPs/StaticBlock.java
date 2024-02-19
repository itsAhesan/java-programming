class Demo{
	static int id;

	static{
		System.out.println("Demo class static block");
		id=101;
	}
	static void details(){
		System.out.println("Details Method..");
		System.out.println(id);
	}

}
class StaticBlock{
	public static void main(String[] args) {
		System.out.println("Main Method...");
		Demo.details();

	}
	static {
		System.out.println("static block 1");
	}
	static{
		System.out.println("static block 2");
	}
}