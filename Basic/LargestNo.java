class LargestNo{
	public static void main(String[] args) {
		int[] nums={3,5,8,2,7};
		// index -  0 1 2 3 4

		int highest=nums[0];
		int second= 0;

		for (int i=1; i<nums.length; i++ ) {
			if(nums[i]>highest){  
				second=highest;
				highest=nums[i];
			
			}else if(nums[i]>second){
				second=nums[i];
			}

		}
		System.out.println("highest no is "+highest);
		System.out.println("second highest no is "+second);
	}
}
// 3,5, 8, 2, 7
/*num[i]>highest-----num[1]>nums[0]---5>3---true---highest=5
												second=3
												highest=5

num[i]>highest-----num[2]>5---------8>5---true---highest=8
												second=5
 												highest=8

num[i]>highest-----num[3]>8---------2>8---false--highest=8
									2>5---false---	

num[i]>highest-----num[4]>8---------7>8---false--highest=8
									7>5---true------------second=7
*/