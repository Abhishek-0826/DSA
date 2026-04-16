import java.util.*;
class CoprimeNum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=1;
		System.out.println();
		for(int i=1; i<=Math.min(a,b); i++){
			if(a%i==0 && b%i==0){
				gcd=i;
			}
		}
		if(gcd==1){
			System.out.println(a+" "+b+" is Coprime Number");
		}else{
			System.out.println(a+" "+b+" is Not Coprime Number");
		}
	}
}

