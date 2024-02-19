class Father{
	void decide(){
		System.out.println("Anita..");
	}
}
class Subham extends Father{
	void decide(){
		System.out.println("Tuli..");
	}
	
}

class MethodOverrid{
	public static void main(String[] args) {
			Father f= new Father();		
			f.decide();

		}	
}