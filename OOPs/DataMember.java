class Student{

	static String uName;
	int id;
	String name;

		void details(){
			System.out.println("=====Student Details=====");
			System.out.println("University name: "+uName);
			System.out.println("Student ID: "+ id);
			System.out.println("Student Name: "+name);
		}
}
class DataMember{
	public static void main(String[] args) {
	
		Student.uName="NBU";

		Student st1= new Student();
		st1.id=101;
		st1.name="Tanushree";

		Student st2= new Student();
		st2.id= 102;
		st2.name= "Tanu";

		st1.details();
		st2.details();		
	}
}