class Demo{
	static void add(int i, int j){
		System.out.println(i+j);
	}
	static void add(int i, int j,int k){
		System.out.println(i+j+k);
	}


}
class Calculator{
	public static void main(String[] args) {
		Demo.add(21,20);
		Demo.add(20,30,10);
		
	}
}