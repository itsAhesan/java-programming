class EvenOdd{
	public static void main(String[] args) {
		int[] num ={12,55,4,25,50,11,9,8,100,27};

		System.out.println("===Even Numbers===");

		for(int i=0; i<num.length; i++){
			if(num[i]%2 == 0){
				System.out.println(num[i]);
			}
		}
		System.out.println("==Odd Numbers===");

		for(int i=0; i<num.length; i++){
			if(num[i]%2 != 0){
				System.out.println(num[i]);
			}

}

	}
}