package praticeSet3;

public class lowerstr {
	public static void main (String[] args) {
		
		String name="Abhishek Rajpurohit has a Big we knOw what";
		String lname=name.toLowerCase();
		System.out.println(lname);
		
		String ren=name.replace(" " , "_");
		System.out.println(ren);
		
		String checker=" letter = \" Dear  Abhishek , this  java is getting started \" ";
		System.out.println(checker);
		
		String letter = "hi this  is a small program";
		System.out.println(letter.indexOf("  "));
		System.out.println(letter.indexOf("   "));
		
		
		
		
		
	}

}
