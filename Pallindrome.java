import java.util.*;
class Palindrome{
	public static void main(String args[]){
		String s=(new Scanner(System.in)).nextLine();
		int n=s.length()-1;
		for(int i=0;i<=n/2;i++)
			if(s.charAt(i)!=s.charAt(n-i)){
				System.out.println("Not Palindrome ! ");
				return;
			}
		System.out.println("Palindrome");
	}import java.util.*;
class Palindrome{
	public static void main(String args[]){
		String s=(new Scanner(System.in)).nextLine();
		int n=s.length()-1;
		for(int i=0;i<=n/2;i++)
			if(s.charAt(i)!=s.charAt(n-i)){
				System.out.println("Not Palindrome ! ");
				return;
			}
		System.out.println("Palindrome");
	}
