import java.util.*;
class Fibonacci{
	public static void main(String args[]){
		int a=0,b=1;
		int n;
		System.out.print("Enter the number of terms in the series : ");
		n=(new Scanner(System.in)).nextInt();
		System.out.print(a+" ");
		if(n==1)return;
		System.out.print(b+" ");
		for(int i=3;i<=n;i++){
			System.out.print(a+b+" ");
			int tmp=a+b;
			a=b;
			b=tmp;
		}
	}
}
