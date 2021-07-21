package iop;
import java.util.*;
public class CBSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CBSE Percentage calculator");
		Scanner sub=new Scanner(System.in);
		
		System.out.println("Enter the marks of subject 1 :");
		float e1=sub.nextFloat();
		System.out.println("Enter the marks of subject 2 :");
		float e2=sub.nextFloat();

		System.out.println("Enter the marks of subject 3 :");
		float e3=sub.nextFloat();

		System.out.println("Enter the marks of subject 4 :");
		float e4=sub.nextFloat();

		System.out.println("Enter the marks of subject 5 :");
		float e5=sub.nextFloat();
		float total=e1+e2+e3+e4+e5;
		float percentage=total/500*100;
		System.out.println(percentage);
		

		

	}

}
