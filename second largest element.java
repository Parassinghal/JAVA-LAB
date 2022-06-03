import java.util.*;
class Secondhighest{
	public static void main(String args[]){
		int n;
		System.out.print("Enter the number of elements in the array : ");
		n=(new Scanner(System.in)).nextInt();
		int arr[]=new int[100];
		for(int i=0;i<n;i++)	arr[i]=(new Scanner(System.in)).nextInt();
		//sorting the array
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[min]>arr[j])	min=j;
			}
			int tmp=arr[i];
			arr[i]=arr[min];
			arr[min]=tmp;
		}
		System.out.println("Second largest element in the array is : "+arr[n-2]);
	}
}
