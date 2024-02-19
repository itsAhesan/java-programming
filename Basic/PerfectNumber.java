class PerfectNumber{
	public static void main(String[] args) {
		int num= 28;                  //  28= 1,2,4,7,14
		int out=0;

		for(int i=1; i<num; i++){
			if (num%i==0) {
				out=out+i;
			}
		}

		if (num==out) {
			System.out.println(num+" is a PerfectNumber");
		}else {
			System.out.println(num+" is not a PerfectNumber");
		}

	}
}

/*Perfect Number
6 = 1,2,3 = 6*
8 = 1,2,4 = 7
9 = 1,3   = 4*/