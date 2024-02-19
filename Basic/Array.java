class Array{
	public static void main(String[] args) {
		int[] rollNo = {101,102,103};
	//  index no         0   1   2

		for(int i=0; i<rollNo.length; i++){
			System.out.println(rollNo[i]);
		}
	}
}
/*
i=0---0<3---true---rollNo[0]--print 101---i++
i=1---1<3---true---rollNo[1]--print 102---i++
i=2---2<3---true---rollNo[2]--print 103---i++
i=3---3<3---false---exit from loop 
*/
