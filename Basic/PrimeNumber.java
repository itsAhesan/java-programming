class PrimeNumber{
	public static void main(String[] args) {
		int num= 10;
		boolean prime = true;

		if (num<2) {              // if number is less then 2 then it is not a prime number
			prime=false;
		}else{			// if number is 2 or greater, then check whether num is prime or not
			for(int i=2; i<num/2; i++){		
			if (num%i==0) {           
				prime=false;
				break;
			}
		}
		}
		if(prime){   
			System.out.println(num+" is a Prime Number");
		}else {
			System.out.println(num+" is a not a Prime Number");
		}
	}
}

/*Prime Number
Armstrong Number
Perfect Number
Neon Number*/

