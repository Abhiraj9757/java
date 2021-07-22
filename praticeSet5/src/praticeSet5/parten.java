package praticeSet5;

public class parten {

	public static void main(String [] args) {
	
//		*****
//		*****
//		*****
//		*****
//		*****
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		  System.out.println();
//		//----
//		11111
//		22222
//		33333
//		44444
//		55555
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		  System.out.println();
		//-------
//		12345
//		12345
//		12345
//		12345
//		12345
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		  System.out.println();
		//-----
//		AAAAA
//		BBBBB
//		CCCCC
//		DDDDD
//		EEEEE
		for(char i='A';i<='E';i++) {
			for(int j='A';j<='E';j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		  System.out.println();
//		//----
//		ABCDE
//		ABCDE
//		ABCDE
//		ABCDE
//		ABCDE
		for(char i='A';i<='E';i++) {
			for(char j='A';j<='E';j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		  System.out.println();
//		//----
//		55555
//		44444
//		33333
//		22222
//		11111
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		  System.out.println();
//		-----
//		54321
//		54321
//		54321
//		54321
//		54321
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		  System.out.println();
		//----
//		EEEEE
//		DDDDD
//		CCCCC
//		BBBBB
//		AAAAA
		for(char i='E';i>='A';i--) {
			for(char j='E';j>='A';j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		  System.out.println();
//		=---=
//		EDCBA
//		EDCBA
//		EDCBA
//		EDCBA
//		EDCBA
		for(char i='E';i>='A';i--) {
			for(char j='E';j>='A';j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		  System.out.println();
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
	      System.out.println();
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
	      System.out.println();	
//	    ----
//	    1
//	    22
//	    333
//	    4444
//	    55555
	    for(int i=1;i<=5;i++) {
	    	
	    
	    for(int j=1;j<=i;j++) {
	    	System.out.print(i);
	    	
	    }
	    System.out.println();
	    }
//	      System.out.println();
//	    1
//	    12
//	    123
//	    1234
//	    12345
	    for(int i=1;i<=5;i++) {
	    	
		    
		    for(int j=1;j<=i;j++) {
		    	System.out.print(j);
		    	
		    }
		    System.out.println();
		    }
		      System.out.println();
	    //----
//	    *****
//	    ****
//	    ***
//	    **
//	    *
	    for(int i=1;i<=5;i++) {    
		    for(int j=5;j>=i;j--) {
		    	System.out.print("*");	
		    	}
		    System.out.println();
		    }
		      System.out.println();
	    //---
//	    11111
//	    2222
//	    333
//	    44
//	    5  
	    for(int i=1;i<=5;i++) {
	    	for(int j=5;j>=i;j--) {
	    		System.out.print(i);
	    	}
	    	System.out.println();
	    }
	      System.out.println();
//	    -----
//	    12345
//	    1234
//	    123
//	    12
//	    1
	    for(int i=5;i>=1;i--) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print(j);
	    	}
	    	System.out.println();
	    }
	      System.out.println();
	    //--
//	    *
//	    **
//	   ***
//	  ****
//	 *****
	    for(int i=1;i<=5;i++) {
	    	
	    
	    for(int j=4;j>=i;j--) {
	    	System.out.print(" ");
	    }
	    for(int k=1;k<=i;k++) {
	    	System.out.print("*");
	    }
	    System.out.println();
	}
	  System.out.println();
//	    ----
//	    1
//	    22
//	   333
//	  4444
//	 55555 
	    for(int i=1;i<=5;i++) {
	    	
		    
		    for(int j=4;j>=i;j--) {
		    	System.out.print(" ");
		    }
		    for(int k=1;k<=i;k++) {
		    	System.out.print(i);
		    }
		    System.out.println();
		}
		  System.out.println();
//	    ----
//	    1
//	    12
//	   123
//	  1234
//	 12345
	    for(int i=1;i<=5;i++) {
	    	
		    
		    for(int j=4;j>=i;j--) {
		    	System.out.print(" ");
		    }
		    for(int k=1;k<=i;k++) {
		    	System.out.print(k);
		    }
		    System.out.println();
		}
		  System.out.println();
	  //------  
//	   *****
//	    ****
//	     ***
//	      **
//	       *
	    for(int i=1;i<=5;i++) {
	    	
	    
	    for(int j=1;j<i;j++) {
	    	System.out.print(" ");
	    }
	    for(int k=5;k>=i;k--) {
	    	System.out.print("*");
	    }
	    System.out.println();
	   
	  }
	    System.out.println();
	
//		//--------
//	     *
//	    **
//	   ***
//	  ****
//	 *****
//	  ****
//	   ***
//	    **
//	     *	
	   for(int i=1;i<=4;i++) {
		   for(int j=4;j>=i;j--) {
			   System.out.print(" ");
		   }
		   for(int k=1;k<=i;k++) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }   
	    for(int i=1;i<=5;i++) {
		    for(int j=1;j<i;j++) {
		    	System.out.print(" ");
		    }
		    for(int k=5;k>=i;k--) {
		    	System.out.print("*");
		    }
		    System.out.println();
		  }
//	  //-------
//	     *
//	    * *
//	   * * *
//	  * * * *
	    System.out.println();
	    for(int i=1;i<=4;i++) {
	  
	for(int j=4;j>=1;j--) {
		
	if(i<j) 	{
		System.out.print(" ");
			}
	else {
		System.out.print(" *");
				}
			}
	System.out.println();
	    }
	    System.out.println();
//	     *
//	    ***
//	   *****
//	  *******
	    for(int i=1;i<=4;i++) {
	  
	    for(int j=4;j>=i;j--) {
	    	System.out.print(" ");
	    }
	    for(int k=1;k<=i;k++) {
	    	System.out.print("*");
	    }
	    for(int l=2;l<=i;l++) {
	    	System.out.print("*");
	    }
	    System.out.println();
	    }
	    System.out.println();
	    
	    //---------
//	    *
//	   *
//	  *
//	 *
	    for(int i=1;i<=4;i++) {
	    	
	    
	    for(int j=4;j>=i;j--) {
	    	System.out.print(" ");
	    	}
	    System.out.print("*");
	    System.out.println();
	    }
	    
	    for(int i=4;i>=1;i--) {
	    	
		    
		    for(int j=4;j>=i;j--) {
		    	System.out.print(" ");
		    	}
		    System.out.print("*");
		    System.out.println();
	    }
	    
 for(int i=4;i>=1;i--) {
	    	
		    
		    for(int j=4;j>=i;j--) {
		    	System.out.print(" ");
		    	}
		    System.out.print("*");
		    
		    for(int j=1;j<=i;j++) {
		    	System.out.print(" ");
		    	}
		    System.out.print("*");
		    System.out.println();
	    }
	    
	}
}
