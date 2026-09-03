class Demo{
	public static void main(String [] args){
		int num = 12345;
		int fst = 0;

		while(num > 0){
			fst = num % 10;
			num = num / 10;
		}
		System.out.println(fst);
	}
}