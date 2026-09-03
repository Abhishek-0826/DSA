class Demo{
	public static void main(String [] args){
		int num = 0;
		int count = 0;

		while(num > 0){
			count++;
			num = num /10;
		}
		if(num == 0 && count == 0){
			count++;
		}
		System.out.println(count);
	}
}