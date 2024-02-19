class Pattern4{
	public static void main(String[] args) {
		int row=10; 
		int star=5;

		for(int r=1; r<=row; r++){
			int num=1;
			for(int s=1; s<=star; s++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			if(r<row/2){
				star--;
			}else if(r==row/2){

			}

			else{
				star++;
			}
		}
	}
}

/*
12345---r=1--1<5---true---star--
1234----r=2--2<5---true---star--
123-----r=3--3<5---true---star--
12------r=4--4<5---true---star--
1-------r=5--5<5--false--(5==5)---true---
1-------r=6--6<5--false--(6==5)---false---else--star++
12--*/	
	

/*
12345
1234
123
12
1
1
12
123
1234
12345
*/