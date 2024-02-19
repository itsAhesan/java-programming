class SelectionSort{
	public static void main(String[] args) {
		int[] num={4,1,3,5,2,7};
		//         0 1 2 3 4 5

		for(int i=0; i<num.length-1; i++){  //1

			for(int j=i+1; j<num.length; j++){  //2

				if(num[i]<num[j]){
		//			num[0]>num[1]        4>1---true  

					int tem=num[i];  //  temp= 4
					num[i]=num[j];	//   num[i] = 1
					num[j]=tem;     //   num[j] = 4
				}
			}
		}
		for(int r=0; r<num.length; r++){
			System.out.println(num[r]);
		}


	}
}

