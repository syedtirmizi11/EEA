import java.util.Scanner;

public class EEA2 {
	public static void main (String args[])   
	{    
	    System.out.println("Number of times you want to run the program: ");
	    Scanner kb = new Scanner(System.in);    
	    int ct = kb.nextInt();    

	    for(int o = 0; o < ct; o++)    
	    {
	        System.out.print("Enter the two integers with space: ");
	        kb.nextLine();
	        long N = kb.nextLong();
	        long a = kb.nextLong();
	        long g;
	        if (a < N) {  g = a;a = N;
	        }
	        else {
	            g = N;
	        }

	        long[] t0 = {a, 1, 0};
	        long[] p1 = {g, 0, 1};
	        long[] w2 = new long[3]; 

	        while (t0[0]-p1[0]*(t0[0]/p1[0]) > 0) {
	            for (int j=0;j<3;j++) w2[j] = p1[j]; 
	            long u = t0[0]/p1[0];        
	            for (int i = 0; i < 3; i++) {
	            p1[i] = (t0[i]-p1[i]*u);
	            }

	            for (int i=0;i<3;i++) t0[i] = w2[i];
	        }
	        System.out.println("INVERSE GCD"); 
	        System.out.printf("%d %d %d",p1[1],p1[2],p1[0]); 
	        if (p1[0]!=1) {
	        	System.out.println("The inverse doesnot exist");
	        }
	    }
	}
	}

	
	

