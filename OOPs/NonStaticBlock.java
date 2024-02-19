class Demo{
	String name;

	{
		System.out.println("NonStaticBlock 1");
		name="Rittika";
	}
	Demo(){
		System.out.println("Demo Constructor");
		System.out.println(name);
	}
	{
		System.out.println("NonStaticBlock 2");
		name="Tanu";
	}
}

class NonStaticBlock{
	public static void main(String[] args) {
		System.out.println("Main Method");

		new Demo();
		new Demo();

	}
}