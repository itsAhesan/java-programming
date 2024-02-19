class Pattern8{
	public static void main(String[] args) {
		int row=9;
		int star=1;

		for(int r=1; r<=row; r++){
			for(int s=1; s<=star; s++){
				System.out.print("* ");
			}
			System.out.println();
			if(r<=4){
				star++;
			}else{
				star--;
			}
		}
	}
}
r=1---1<=9;--true----s=1--1<=1;---true---* ---s++;
					 s=2--2<=1;---false----exit from loop---
					 println()---move the cursor next line--
					 r=1---1<=4;---true----star++ ----2;
					 r++;
r=2---2<=9;--true--- s=1--1<=2;--true---* --s++;
					 s=2--2<=2;--true---* --s++;
					 s=3--3<=2;--false-----exit from loop
					 println();---move the cursor next line 
					 r= 2; 2<=4;---true----star++ ---3;


/*
*
**
***
****
*****
****
***
**
*
   */