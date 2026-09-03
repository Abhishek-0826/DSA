class Demo{
	public static void main(String [] args){
		int num = 125;
		int x = num ;
		int sum = 0;
		int mult = 1;
		int a = 0;
		boolean result = false;

		while(num > 0){
			a = num % 10;
			num = num / 10;

			while(a > 0){
				mult = mult * a;
				a--;
			}
			sum = sum + mult;
			mult = 1;
		}
		if(sum == x){
			result = true;
		}
		System.out.println(result);
		
	}
}