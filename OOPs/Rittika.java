class Student{         // blue print 
	int id;				// information of student obj
	String name;    	//  information of student obj

	void details(){     // behavior or functionality 
		System.out.println("Student  id: "+id);
		System.out.println("Student  name: "+name);
	}
	void reading(){     // behavior or functionality 
		System.out.println(id+" "+name+" Student is reading ");

	}
}
class Rittika{
	public static void main(String[] args) {
		
		Student st1= new Student();           // object
		st1.id=101;
		st1.name="Rittika";

		Student st2= new Student();     	// object
		st2.id= 102;
		st2.name= "Tuli";

		Student st3= new Student(); 		// object
		st3.id= 103;
		st3.name= "Tanu";

		st1.details();
		st2.details();
		st3.details();
		st1.reading();
		

	}
}