class Demo{
	public static void main(String [] args){
		int num = 123934;

		int smallest_no = 9;

		while(num > 0){
			if(smallest_no > num%10){
				smallest_no = num % 10;
			}
			num = num / 10;
		}
		System.out.println(smallest_no);
	}
}