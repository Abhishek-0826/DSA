class Demo{
	public static void main(String [] args){
		int num = 1245245;
		int target = 3;
		int count = 0 ;

		while(num > 0){
			if(num % 10 == target){
				count++;
			}
			num = num / 10;
		}
		if(count == 0){
			System.out.println("target not found");
		}else{
			System.out.println("occurrence of target is :"+count);
		}
	}
}