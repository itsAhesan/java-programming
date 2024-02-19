class ThisDemo{
	ThisDemo(){
		System.out.println("This Demo..1");
	}
	ThisDemo(int i){
		this();
		System.out.println("This Demo..2");
	}
	ThisDemo(int i, int j){
		this(i);
		System.out.println("This Demo..3");
	}

}

class ThisStatement{
	public static void main(String[] args) {
		new ThisDemo(20,30);
		

	}
}