package praticeSet5;

public class parten {

	public static void main(String [] args) {
		/*
		for(int i=3;i>=0;i--) {
			System.out.print("*");
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
				
			}
			System.out.print("\n");
		}
		*/
		//pattern
		  //*****
	    //****
	    //***
	    //**
	    //*
	    for(int i=1;i<6;i++){
	        
	        for(int j=6;j>i;j--){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    //*
	    //**
	    //***
	    //****
	    //*****
	    for(int i=1;i<6;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }		
	}
}
