class Demo{
	public static void main(String [] args){
		int num = 1234;
		int sum = 0;
		int mult = 1;
		boolean result = false;

		while(num > 0){
			sum = sum + num % 10;
			mult = mult * num % 10;
			num = num / 10;
		}
		if(sum == mult){
			result = true;
		}
		System.out.println(result);
	}
	
}