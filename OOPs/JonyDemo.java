class RittikaDemo{
	static void getDetails(long num){
		System.out.println("Dialing...."+num);
	}

	static void getPins(int[] pins){
		for (int i=0; i<pins.length; i++) {
			System.out.println("Visit...."+pins[i]);
		}

	}

}
class JonyDemo{
	public static void main(String[] args) {

		long n= 76868797L;
		RittikaDemo.getDetails(n);

		int[] pin={732725, 126781, 736352}; 
		RittikaDemo.getPins(pin);

	}
}