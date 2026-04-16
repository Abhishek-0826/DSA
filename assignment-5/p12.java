import java.util.*;
class GCDEuclidean{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=1;
		System.out.println();
		while(a!=0 && b!=0){
			if(a>b){
				a=a%b;
			}else{
				b=b%a;
			}	
		}

		System.out.println("GCD butween a & b : "+a+" "+b);
		
	}
}

