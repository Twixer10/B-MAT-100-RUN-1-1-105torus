package fr.twixer.torus;

import fr.twixer.torus.Utils.Bissection;
import fr.twixer.torus.Utils.Newton;
import fr.twixer.torus.Utils.Secante;

public class Main {

	public static void main(String[] args) {
		if(args.length == 1) {
			if (args[0].equals("-h")) {
				System.out.println("USAGE\n" + 
						"\t./105torus opt a0 a1 a2 a3 a4 n\n\n" + 
						"DESCRIPTION\n" + 
						"\topt\tmethod option:\n" + 
						"\t\t\t1 for the bisection method\n" + 
						"\t\t\t2 for Newton’s method\n" + 
						"\t\t\t3 for the secant method\n" + 
						"\ta[0-4]\tcoefficients of the equation\n" + 
						"\tn\tprecision (the application of the polynomial to the solution should be smaller than 10ˆ-n)");
				System.exit(0);
			} else {
				System.exit(84);
			}
		} else if(args.length == 7) {
			Init(args);
		} else {
			System.exit(84);
		}		
	}
	
	private static void Init(String[] args) {
		int opt = 0;
		int a0 = 0;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int n = 0;
		try {
			opt = Integer.valueOf(args[0]);
			a0 = Integer.valueOf(args[1]);
			a1 = Integer.valueOf(args[2]);
			a2 = Integer.valueOf(args[3]);
			a3 = Integer.valueOf(args[4]);
			a4 = Integer.valueOf(args[5]);
			n = Integer.valueOf(args[6]);
		} catch (Exception e) {
			System.exit(84);
		}
		if (n <= 0 ) {
			System.exit(84);
		}
		if (opt == 1) {
			new Bissection(a0, a1, a2, a3, a4, 0, 1, 0, 0, 0, n).exe();
		}
		if (opt == 2) {
			new Newton(a0, a1, a2, a3, a4, 0.5, 0, 0, 0, n).exe();
		}
		if (opt == 3) {
			new Secante(a0, a1, a2, a3, a4, 0, 1, 0, 0, 0, n).exe();
		} else {
			System.exit(84);
		}
	}
	
}
