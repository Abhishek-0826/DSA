import java.util.*;
class CountNumOfDivisors{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		System.out.println();
		for(int i=1; i<=Math.sqrt(n); i++){
			if(n%i==0){
				count++;
				if(i!=n/i){
					count++;
				}
			}
		}
		System.out.println("Count Digit of  N : "+count);
		
	}
}