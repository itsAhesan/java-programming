class PalindromeString{
	public static void main(String[] args) {
		String name = "mom" ; // m , o, m  
		                     //  0   1  2

		String out = "" ;  

		for(int i=name.length()-1; i>=0; i--){
			out = out + name.charAt(i);
		}

		System.out.println(name==out);          // false
		System.out.println(name.equals(out));   // true

		if(name.equals(out)){
			System.out.println(name+" is a Palindrome String");
		}else{
			System.out.println(name+" is not a Palindrome String");
		}
		

	}
}
/* mom = mom */