class NeonNumber{
	public static void main(String[] args) {
		int num=9;  // 9 = 9*9 = 81 = 8+1 = 9
		int out=0;
		int sqr=num*num; // 8 1

		while (sqr>0) {
			int rem= sqr%10;    
			out=out+rem;      
			sqr=sqr/10;       
		}

		if (num==out) {
			System.out.println(num+" is a NeonNumber");
			
		}else {
			System.out.println(num+" is not a NeonNumber");
		}
		

	}
}