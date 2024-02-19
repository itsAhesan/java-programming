class Pattern1{
	public static void main(String[] args) {
		int row= 5;
		int star= 5;

		for(int r=1; r<=row; r++){                  
			for (int i= 1; i<=star; i++){           
				System.out.print("* ");            
			}
			System.out.println();
			star--;
		}

	}
}