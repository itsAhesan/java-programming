class Pattern{
	public static void main(String[] args) {

		for(int r=1; r<=3; r++){                   //      * * *    
			for (int i= 1; i<=3; i++){             //      * * *
				System.out.print("* ");            //      * * * 
			}
			System.out.println();

		}
}
}
/*=========== dry and map =========
r=1--- 1<=3--true---  i=1--1<=3--true--print * --- i++
                      i=2--2<=3--true--print * --- i++
                      i=3--3<=3--true--print * --- i++
                      i=4--4<=3--false--------exit from the loop 
                      println()----move the cursor next line-------    r++

r=2--- 2<=3-- true--- i=1--1<=3--true--print * --- i++
                      i=2--2<=3--true--print * --- i++
                      i=3--3<=3--true--print * --- i++
                      i=4--4<=3--false--------exit from the loop 
                      println()----move the cursor next line-------    r++

r=3-- 3<=3-- true---  i=1--1<=3--true--print * --- i++
                      i=2--2<=3--true--print * --- i++
                      i=3--3<=3--true--print * --- i++
                      i=4--4<=3--false--------exit from the loop 
                      println()----move the cursor next line-------    r++

r=4-- 4<=3-- false--exit from the loop*/




 