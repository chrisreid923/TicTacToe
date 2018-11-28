import java.util.Scanner;

public class main {
	    public static void main(String[] args) {
	        
	    	Scanner scan = new Scanner(System.in);
	    	
//The playing field will be these integers. 	    	
	    	int UL1 = 0;
	    	int L1 = 0;
	    	int LL1 = 0;
	    	
	    	int UC1 = 0;
	    	int C1 = 0;
	    	int LC1 = 0;
	    	
	    	int UR1 = 0;
	    	int R1 = 0;
	    	int LR1 = 0;
	    	
	    	System.out.println("Pick a Space on the Board: UL, L, LL, UC, C, LC, UR, R, LR");

	    	String UL = null;
	    	String L = null;
	    	String LL = null;
	    	String UC = null; 
	    	String C = null;
	    	String LC = null;
	    	String UR = null;
	    	String R = null;
	    	String LR = null;
	    	
			if (scan.nextLine() == UL) {
				UL1 = 1;
				System.out.println("You have marked the Upper Left Corner");
			}else if (scan.nextLine() == L) {
				L1 = 1;
				System.out.println("You have marked the Left Corner");
			}else if (scan.nextLine() == LL) {
				LL1 = 1;
				System.out.println("You have marked the Lower Left Corner");
	    	}else if (scan.nextLine() == UC) {
	    		UC1 = 1;
	    		System.out.println("You have marked the Upper Center Corner");
	    	}else if (scan.nextLine() == C) {
	    		C1 = 1;
	    		System.out.println("You have marked the Center Corner");
	    	}else if (scan.nextLine() == LC) {
	    		LC1 = 1;
	    		System.out.println("You have marked the Lower Center Corner");
	    	}else if (scan.nextLine() == UR) {
	    		UR1 = 1;
	    		System.out.println("You have marked the Upper Right Corner");
	    	}else if (scan.nextLine() == R) {
	    		R1 = 1;
	    		System.out.println("You have marked the Right Corner");
	    	}else if (scan.nextLine() == LR) {
	    		LR1 = 1;
	    		System.out.println("You have marked the Lower Right Corner");
	    	}
	}
}