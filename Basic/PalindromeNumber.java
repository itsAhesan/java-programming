class PalindromeNumber{
	public static void main(String[] args) {
			int num = 1234;
			int input= num;
			int out = 0;

			

			while(num!=0){
				int rem = num%10;
				out= out*10+rem;
				num= num/10;       /* num= 1234/10= 123 
				                         = 123/10 = 12
				                         = 12/10  = 1
				                         = 1/10   = 0*/
			}

			if(input==out){
				System.out.println(input+" is a Palindrome Number");
			}else{
				System.out.println(input+" is not a Palindrome Number");
			}



	}
}