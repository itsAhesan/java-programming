class Number12{
	public static void main(String[] args) {
		int row= 5;
		int star=1;

		for(int r=1; r<=row; r++){
			int num= star;
			for(int s=1; s<=star; s++){
				System.out.print(num+" ");
				num+=5;
			}
			System.out.println();
			star++;
		}
		
	}
}
/*
1
2 7
3 8 13
4 9 14 19
5 10 15 20 25*/