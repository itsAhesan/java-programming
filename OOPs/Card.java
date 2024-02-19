class ICard{
	final int id;
	String name;

ICard(int i){
	id=i;
}
	void details(){
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);

	}
}

class Card{
	public static void main(String[] args) {
		ICard c1= new ICard(101);
		c1.name="Rittika";
		c1.details();

		ICard c2 =new ICard(102);
		c2.name="Tuli";
		c2.details();
	}
}