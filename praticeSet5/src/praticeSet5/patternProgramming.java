package praticeSet5;
import java.util.*;
public class patternProgramming {
	public static void main(String [] args) {
		
	//question 1
		
	//System.out.println("Pattern Prgtamming");
//	for(int i=1;i<5;i++) {
//		for(int j=5;j>i;j--) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//	}
//	
		//question 2 sum first n even number using whoile loop
//		int n=0;
//		int sum=0;
//		while(n<3) {
//			
//				sum=sum+2*n;
//			n++;
//		}
//		System.out.println(sum);
//		
		//question 3 write multiplication of given n number;
		/*
		System.out.println("Write the which number multiplication you want ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<11;i++) {
			System.out.println(n +" * "+i+ " = " +n*i);
		}
		
		//question 4 multiplication of 10 in reverse
		int a=10;
		for(int i=10;i>0;i--) {
			System.out.println(a +" * "+i+ " = " +a*i);
		}
		*/
	
		//question 5 factorial number
		
		System.out.println("Enter a number to find factorial of it :");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
              num*=i;
			System.out.println(num);
	
		}
	
		System.out.println(num);
		
		
//	while(num>=1) {
//		int snum=num*num-1;
//		num--;
//	}
	}
}
