class Demo{
	public static void main(String [] args){
		int num = 120;
		int ans = 0;

		while(num > 0){
			ans = ans + num % 10 ; 	
			if(num > 10){
				ans = ans * 10 ;
			}
			num = num / 10;
		}	
		System.out.println(ans);
	}
}