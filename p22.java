class Demo{
	public static void main(String[] args){
		int num = 0226;
		boolean result = false ;
		int a = 0;

		if(num > 10){
			while(num > 0 ){
				a = num % 10;
				if(a == 0){
					result = true;
				}
				num = num / 10;
			}
		}
		System.out.println(result);
	}
}