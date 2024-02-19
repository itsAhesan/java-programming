class MainOverLoad{

	public static void main(String[] args) {
		System.out.println("String.....");

		main(new char[0]);
		main(new int[0]);

	}



	public static void main(char[] args) {
		System.out.println("Char.....");
	}
	public static void main(int[] args) {
		System.out.println("int....");
	}
}