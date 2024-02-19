class ArmstrongNumber{
	public static void main(String[] args) {
		int num= 153;
		int num1= num;
		int out=0;

		while(num>0){
			int rem= num%10;  
			out= out+ rem*rem*rem;  
			num= num/10;
		}

		if (num1==out) {
			System.out.println(num1+ " is a ArmstrongNumber");
		}else{
			System.out.println(num1+ " is not a ArmstrongNumber");
		}
	}

}

/*Armstrong Number
153 = 1^3  5^3  3^3 = 1+125+27 = 153*/