// Task2-> Pattern Program
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
		solve(n);
	}
	
	static void solve(int n){
	    ArrayList<String> arr=new ArrayList<>();
	    for(int i=0;i<n;i++){
	        arr.add(String.valueOf((char)('A'+i)));
	    }
	    for(int i=1;i<=n;i++){
	        temp(arr,i);
	        for(int j=1;j<=((n-i)*2);j++){
	          System.out.print(" ");   
	        }
	        temp(arr,i);
	        System.out.println();
	    }
	    for(int i=n;i>=1;i--){
	        temp(arr,i);
	        for(int j=1;j<=((n-i)*2);j++){
	          System.out.print(" ");   
	        }
	        temp(arr,i);
	        System.out.println();
	    }
	}
	
	static void temp(ArrayList<String> arr,int i){
	    System.out.print(arr.get(0));
	    if(i>=3){
	       for(int j=1;j<=i-2;j++)
	       { System.out.print(" "); }
	    }
	    if(i>=2){
	       System.out.print(arr.get(i-1));
	    }
	}
}
