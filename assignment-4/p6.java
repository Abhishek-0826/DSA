class Demo{
	public static void main(String[]args){

	int n = 3 ;
	int num = 1 ;

		for(int i = 1 ; i <= n ; i++){
			for(int j = 1 ; j <= n ; j++){
				System.out.print(num+" ");
				num++;
			}
		System.out.println();
		}
	}
}

/*
O/P :

1 2 3
4 5 6
7 8 9

TC : O(n^2)
SC : O(1)
*/