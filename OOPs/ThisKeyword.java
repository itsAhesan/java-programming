class Human{
	int age;
	String name;

	Human(int age, String name){
		System.out.println("Cons "+this);
		this.age=age;
		this.name=name;
//     DM = Local
}
	void details(){
		System.out.println("Method "+this);
		System.out.println(age);
		System.out.println(name);
	}
}
class ThisKeyword{
	public static void main(String[] args) {
		Human h1= new Human(21,"Rittika");
		System.out.println("OBJ "+h1);
		h1.details();

		Human h2= new Human(22,"Tanu");
		System.out.println("OBJ "+h2);
		h2.details();

	}
}