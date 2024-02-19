class Pattern15{
	public static void main(String[] args) {
		int row=5;
		int star=1;

		for(int r=1; r<=row; r++){
			for(int s=1; s<=star; s++){

				if(s==1 || s==star || r==row ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}			
			System.out.println();
			star++;
		}
	}
}
/*	
---------dry and map-----------
star=1
r=1;---1<=5;----true-----s=1;---1<=1---true---if(1==1) true--print *----   s++
						 s=2;---2<=1---false exit from loop
						 println()----move the cursor next line---star++  -----     r++
star=2;
r=2;---2<=5;----true----s=1;----1<=2---true---if(1==1) true--print *---- s++
						s=2;----2<=2---true---if(2==1) false|| (2==2) true---print *---s++
						s=3;----3<=2---false exit from loop
						println()----move the cursor next line---star++ ---- r++
star=3;
r=3;---3<=5;----true--- s=1;---1<=3;---true---if(1==1) true----print *---s++
						s=2;---2<=3;---true---if(2==1) false|| (2==3) false||(3==5) false
						                      else---print (" ")----s++
						s=3;---3<=3----true---if(3==1) false|| (3==3) true---print *---s++
						s=4----4<=3 ----false exit from loop
						println()----move the cursor next line---star++ ---- r++
star=4;
r=4;---4<=5----true-----s=1;---1<=4;---true---if(1==1) true----print *---s++
						s=2;---2<=4;---true---if(2==1) false|| (2==4) false || (4==5) false 
						                      else---print (" ")----s++
						s=3;---3<=4;---true---if(3==1) false|| (3==4) false|| (4==5) false 
						                      else---print (" ")---- s++
						s=4;---4<=4----true---if(4==1) false|| (4==4) true----print *---s++
						s=5;---5<=4----false exit from loop
						println()----move the cursor next line---star++ ---- r++
star=5;
r=5;---5<=5----true----s=1;---1<=5;---true---if(1==1) true----print *----s++
					   s=2;---2<=5----true---if(2==1) false|| (2==5) false|| (5==5) true----print *---s++
					   s=3;---3<=5----true---if(3==1) false|| (3==5) false|| (5==5) true ----print * ---s++
					   s=4;---4<=5----true---if(4==1) false|| (4==5) false|| (5==5) true----print *----s++
					   s=5;---5<=5---true---if(5==1) false||  (5==5) true---print *----s++
					   s=6;---6<=5-----false exit from loop
					   println()----move the cursor next line---star++ ---- r++
star=6;
r=6;-------6<=5---false exit from loop



*
**
* *
*  *
*****
*/
