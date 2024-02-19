class PrimitiveTypeCasting{
	public static void main(String[] args) {
		
		byte b=10;
	//	short s=b;			// Wedining(Implicit)
		short s=(short)b;	// Wedining(Explicit)


		System.out.println(s);

		short s1= 200;	
		byte b1=(byte)s1;	// Narrowing(Explicit)

		System.out.println(b1);	//20



	}
}