interface JDBC{			//=======object utilization layer=====
	void inserData();
}
class ConnectionManager{		//=======object Creation layer=====
	static JDBC getConnect(String name){
		if (name.equals("MySql")) {
			return new MySql();
		}else if(name.equals("Oracle")){
			return new Oracle();
		}else{
			return null;
		}
	}
}
class MySql implements JDBC{	//=======object Implementation layer=====
	public void inserData(){
		System.out.println("Insert data into MySql");
	}
}
class Oracle implements JDBC{	
	public void inserData(){
		System.out.println("Insert data into Oracle");
	}
}
class LooseCouple{
	public static void main(String[] args) {
		JDBC jdbc =ConnectionManager.getConnect("Oracle");
		jdbc.inserData();

		/*JDBC j =new MySql("Mysql");
		j.inserData();*/

		
	}
}