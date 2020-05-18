import java.util.*;
public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		int flag = 0;	
		if(n<0){
			System.out.println("You entered a negative number %d"+n);		
			flag = 1;		
		}		
		for(int j=2; j<=n; j++) {
			fact *= j;
		}
		if(flag==0)
			System.out.println("Entered Number : "+n+" Factorial : "+fact);				
	}
}	
