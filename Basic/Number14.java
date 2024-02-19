class Number14{
	public static void main(String[] args) {
		int row= 5;
		int star= 1;
		
		for(int r=1; r<=row; r++){
			int num=1;
			for(int i=1; i<=star; i++){
				System.out.print(num+" ");
				if(i<=star/2){
					num++;
				}else{
					num--;
				}
			}
			System.out.println();
			star+=2;
		}
	}
}
/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1 */