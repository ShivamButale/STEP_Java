import java.util.*; public class Prime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0;
		for(int j=2;j<n/2;j++) {
			if(n%j==0){
				System.out.println("Not prime");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Prime");
	}
}
