import java.util.*;
class CountWords
{
	public static void main(String args[]){
		String s;
		s=(new Scanner(System.in)).nextLine();
		int sz=s.length();
		int it=0;
		for(int i=0;i<sz;i++)
			if(s.charAt(i)!=' ')	it++;
		System.out.println("Number of characters : "+it);
	}
};
