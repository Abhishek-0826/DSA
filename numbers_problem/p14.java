class Demo{
	public static void main(String [] args){
		int num = 1234556789;
		int odd = 0;

		while(num > 0){
			
			if(num % 10 % 2 != 0){
				odd++;
			}
			num = num / 10;
		}
		System.out.println(odd);
	}
}