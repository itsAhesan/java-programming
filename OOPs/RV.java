class School{
	int id;

}
class RV{
	public static void main(String[] args) {
		 
		 School s1 =new School();
		 s1.id=101;

		 System.out.println(s1.id);  // 101


		  School s2 =new School();

		  s2=s1;
		  System.out.println(s2.id);   // 101

		  s2.id=102;
		  System.out.println(s2.id);   // 102
		  System.out.println(s1.id);   //102

		  int num= 1;   // num --> positive variable
		  byte n= -2;  


		  School s1 =new School();   //  s1---> Reference variable


	}
}