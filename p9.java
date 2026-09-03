class Demo{
	public static void main(String [] args){
		int num = 12345;
		int first = 0;
		int last = num % 10;

		while(num > 0){
			first = num % 10;
			num = num / 10;
		}
		System.out.println(first);
		System.out.println(last);
	}
}