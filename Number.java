import java.util.*;
public class Number{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number:-");
	int num=sc.nextInt();
	if(num%2==0){
		System.out.println("even number");
	}
	else{
		System.out.println("odd number");
		}
	}
}