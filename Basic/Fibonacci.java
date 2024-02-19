class Fibonacci{
	static void main(String[] args) {
		
		int num=20;
		int a= 0;
		int b= 1;
		System.out.print(a+" "+b);  // 0 1

		for(int i=2; i<num; i++){    // 2 3 4 5 6 7 8 



			int c=a+b;   
			System.out.print(" "+c);
			a=b;        
			b=c;       
		}
	}
}
/*0 1 1 2 3 5 8 13 21 ........*/
        

