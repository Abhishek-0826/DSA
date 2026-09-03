class Demo{
	public static void main(String [] args){
		int num = 123;
		int a = num;
		int mult = 0;
		int n = 0;	

		while(num > 0){
			n = num % 10;
			mult = mult + (n*n*n);
			num = num / 10;
		}
		if(a == mult){
			System.out.println("given no is Armstrong");
		}else{
			System.out.println("given no is not Armstrong");

		}
		
	}
}