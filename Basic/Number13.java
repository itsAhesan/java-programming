class Number13{
	public static void main(String[] args) {
		int row= 6;
		int star= 1;
		int spc= 5;

		for(int r=1; r<=row; r++){

			for(int s=1; s<=spc; s++){
				System.out.print(" ");
			}
			int num=1;
			for(int i=1; i<=star; i++){
				System.out.print(num+" ");
				num= num*(r-i)/i;
			}
			System.out.println();
			star++;
			spc--;
		}
	}	
}
/*
star=3; r=3; num=1;
i=1;----1<=3---true----print 1;--num = 1*(3-1)/1 =2 ----i++
i=2;----2<=3---true----print 2;--num = 2*(3-2)/2 =1 ----i++
i=3;----3<=3---true----print 1;--num = 1*(3-3)/3 =0 ----i++
i=4;----4<=3----false loop exit--
        println()----star++ ----- r++
star=4; r=4; num=1;
i=1;----1<=4;---true----print 1;--num = 1*(4-1)/1 = 3 ---i++
i=2;----2<=4;---true----print 3;--num = 3*(4-2)/2 = 3 ---i++
i=3;----3<=4;---true----print 3;--num = 3*(4-3)/3 = 1 ---i++
i=4;----4<=4;---true----print 1;--
*/






/*
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
*/