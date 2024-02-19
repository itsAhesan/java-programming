class Student{
	int id;
	String name;
	static String uName;

	Student(int i, String n){
		id=i;
		name=n;
		
	}
	void details(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(uName);
	}

}

class MemoryAllocation{
	public static void main(String[] args) {
		Student.uName="NBU";
		Student st1= new Student(101,"Rittika");
		st1.details();

	}
}