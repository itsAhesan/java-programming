class Array1{
	public static void main(String[] args) {
		
		int[] rollNo = new int[3];

		System.out.println("===Array without value===");
		for(int i=0; i<rollNo.length; i++){
			System.out.println(rollNo[i]);
		}

		System.out.println("===Array with value===");
		rollNo[0] = 101;
		rollNo[1] = 102;
		rollNo[2] = 103;

		for(int i=0; i<rollNo.length; i++){
			System.out.println(rollNo[i]);
		}



	}
}