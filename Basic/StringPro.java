class StringPro{
	public static void main(String[] args) {
		char[] name= {'R','I','T','T','I','K','A'};

		for(int i=0; i<name.length; i++){
			System.out.print(name[i]);
		}
		System.out.println();
		System.out.println(name[5]);

		String name1 = "Rittika";
		System.out.println(name1);
		System.out.println(name1.charAt(5));
		System.out.println(name1.indexOf('k'));

		char[] name2 =name1.toCharArray();   // {'R','I','T','T','I','K','A'};
		for(int i=0; i<name2.length; i++){
			System.out.println(name2[i]);
		}
	}
}
/*RITTIKA*/