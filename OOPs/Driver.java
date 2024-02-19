class Engine{
	String eName="Turbo";
	void start(){
		System.out.println("Engine Started");
	}
}
class Car{
	String cName="BMW";
	Engine e=new Engine();
	
	void drive(){
		e.start();
		System.out.println("Car Start Moving");
	}

}

class Driver{
	public static void main(String[] args) {
		Car c=new Car();

		c.drive();

		

	}
}