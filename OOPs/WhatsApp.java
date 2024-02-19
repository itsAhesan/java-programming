class Member{
	String name;
	void chat(){
		System.out.println(name+" Chatting in Group");
	}
}
class Admin extends Member{
	void addUser(){
		System.out.println(name+" Add Another Member");
	}
}

class WhatsApp{
	public static void main(String[] args) {
		Member mem =new Admin();	
		mem.name="Rittika";
		mem.chat();

		if(mem instanceof Admin){
			Admin ad= (Admin)mem;	
			ad.chat();
			ad.addUser();
		}
	}
}