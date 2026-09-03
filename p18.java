class Demo{
	public static void main(String [] args){
		int num = 18;
		int a = num ;
		int add = 0;
		
		while(num > 0){
			add = add + num % 10;
			num = num / 10;
		}
		if(a % add == 0){
			System.out.println("given no is Harshad no");
		}else{
			System.out.println("given no is not  Harshad no");
		}
	}	
}