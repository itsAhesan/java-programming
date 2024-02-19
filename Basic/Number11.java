class Number11{
	public static void main(String[] args) {
		int row=5;
		int star=1;
		int tem=1;

		for(int r=1; r<=row; r++){

			int num= tem;

			for(int s=1; s<=star; s++){
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
			star++;
			tem++;
		}	

	}
}
/*
1
21
321
4321
54321*/