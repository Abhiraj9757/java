package iop;
import java.util.Scanner;
public class KmToMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter km : ");
double km=sc.nextDouble();
double miles=km*0.62137;
System.out.println(km +" convertd into "+miles+" miles");
	}

}
