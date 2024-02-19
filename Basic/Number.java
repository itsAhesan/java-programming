class Number{
	public static void main(String[] args) {
		int row=5;
		int star=1;
		
		for(int r=1; r<=row; r++){
			int number = 1;

			for(int i=1; i<=star; i++){
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
			star++;
		}

	}
}