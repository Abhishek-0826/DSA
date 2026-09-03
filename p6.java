class Demo{
	public static void main(String [] args){
		int num = 12345;
		int sum = 1;
		

		while(num > 0){
			int a = 0;
			a = num % 10;
			sum = sum * a;
			num = num / 10;
		}
		System.out.println(sum);
	}
}