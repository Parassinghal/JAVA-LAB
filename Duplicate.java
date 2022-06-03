import java.util.*;
class Duplicate{
	public static void main(String args[]){
		String s=(new Scanner(System.in)).nextLine();
		int n=s.length();
		System.out.println("The duplicate characters are : ");
		//s.sort();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++)
				if(s.charAt(i)==s.charAt(j)){
					System.out.print(s.charAt(i)+" ");
				}
		}
	}
};
