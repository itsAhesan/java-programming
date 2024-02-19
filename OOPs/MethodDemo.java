class Demo{
	int id;
	String name;
	String address;

	void details(){
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}
class MethodDemo{
	public static void main(String[] args) {
		Demo d1= new Demo();
		d1.id=101;
		d1.name="Rittika";
		d1.address="Alip";
		d1.details();

		Demo d2= new Demo();
		d2.id=102;
		d2.name="Tanu";
		d2.address="SLG";
		d2.details();

	}
}