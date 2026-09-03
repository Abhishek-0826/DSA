class Demo{
	public static void main(String [] args){
		int num = 1239304;

		int largest_no = 0;

		while(num > 0){
			if(largest_no < num%10){
				largest_no = num % 10;
			}
			num = num / 10;
		}
		System.out.println(largest_no);
	}
}