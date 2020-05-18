import java.util.*;
public class Bubblesort {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		//int arr[] = {3,4,5,6,9,8};
		int i;
		int arr[] = new int[n];
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int j;
		for(i=0;i<n-1;i++){
			for(j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Printing Sorted Array");
		for(i=0;i<n;i++)
			System.out.print(arr[i]+ " ");
		System.out.println();
	}
}
