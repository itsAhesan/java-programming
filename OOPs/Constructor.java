 class Human{	//=======User-define Constructor=======
	int age;
	String name;
	String gender;

Human(int i, String n, String g){   
	age=i;
	name=n;
	gender=g;       
}
Human(String n, int a, String g){
	name=n;
	age=a;
	gender=g;
}
Human(int a){
	age=a;
}

void details(){
	System.out.println(age);
	System.out.println(name);
	System.out.println(gender);
}
}
class Constructor{
	public static void main(String[] args) {
		Human h1= new Human(20, "Rittika", "Female");    //  new---is a keyword , Human()---Constructor
		h1.details();

		Human h2= new Human("Tanu", 20, "Female");
		h2.details();

		Human h3 =new Human(21);
		System.out.println(h3.age);
		

	}
}