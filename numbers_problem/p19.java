class Demo{
	public static void main(String [] args){
		int num = 12345;
		int n = 5;
		int count = 0;
		while(num > 0){
			count++;
			if(count == n){
				System.out.println(num % 10);
				break;
			}
			num = num / 10;
		}

	}
}