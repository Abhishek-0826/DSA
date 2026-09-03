class Demo{
	public static void main(String [] args){
		int num = 12345;
		int ans = 0;

		while(num > 0){
			ans = num % 10;
			System.out.print(ans+" ");
			num = num / 10;
		} 
	}
}