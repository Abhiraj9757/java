package rockpaper;
import java.util.Random;
import java.util.Scanner;
public class rockPaperSessior {

	public static void main(String[] args) {
		int i =1;Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		while( i<=3) {
			
		
		System.out.println("Choose any one option");
		System.out.println(" 0 .  Rock");
		System.out.println(" 1 .  Paper");
		System.out.println(" 2 .  Sissior");
		
		
		int num1 =sc.nextInt();
		switch(num1) {
		case 0 ->		System.out.println(name +" choosed Rock");
		case 1 ->		System.out.println(name +" choosed paper");
		case 2 ->		System.out.println(name +" choosed sissior ");
		default ->		System.out.println("Wrong input");

		}
		Random num = new Random();
		int x=num.nextInt(3);
		switch(x) {
case 0-> System.out.println("Computer choosed Rock");
case 1-> System.out.println("Computer choosed paper");
case 2-> System.out.println("Computer choosed sissior");
default ->		System.out.println("Wrong input");

}

if (num1 == x) {
	System.out.println("TIE");
}
else if(num1 ==0 && x==1) {
	System.out.println("Computer won");

}
else if(num1 ==0 && x==2) {
	System.out.println(name +" won");

}
else if(num1 ==1 && x==0) {
	System.out.println(name +"won");

}
else if(num1 ==1 && x==2) {
	System.out.println("Computer won");

}
else if(num1 ==2 && x==0) {
	System.out.println("Computer won");

}
else if(num1 ==2 && x==1) {
	System.out.println(name + " won");

}
i++	;
		}
	}

}
