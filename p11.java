class Demo{
	public static void main(String args[]){
		int num = 143;
		int rev = 0;
		int a = num ;

		while(a > 0){
			rev = rev * 10;
			rev = rev + (a % 10);
			
			a = a/10;
		}
		if(rev == num){
			System.out.println("number is Palindrome");
		}else{
			System.out.println("number is not Palindrome");			
		}
	}
}