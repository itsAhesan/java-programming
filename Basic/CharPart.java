class CharPart{
	public static void main(String[] args) {
		int row=6;
		int star=1;

		for(int r=1; r<=row; r++){
			char c= 'A';
			for(int i=1; i<=star; i++){
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
			star++;
		}

	}
}
/*
A
A B 
A B C 
A B C D 
A B C D E
A B C D E F*/