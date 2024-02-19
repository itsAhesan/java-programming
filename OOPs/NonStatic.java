class Demo{
	static int count; 
	Demo(){
		
	}
	Demo(int i){
		
	}
	Demo(int i, int j){
		
	}
	{
		count++;
	}
}
class NonStatic{
	public static void main(String[] args) {
		new Demo();
		new Demo();
		new Demo(10,15);
		new Demo();
		new Demo(1,2);
		new Demo();
		new Demo();
		new Demo(50);
		new Demo(20);
		new Demo();
		new Demo();
		new Demo(10);
		System.out.println(Demo.count);

	}
}