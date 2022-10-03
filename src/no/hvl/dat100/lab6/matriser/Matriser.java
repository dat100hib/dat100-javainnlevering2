package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	import static javax.swing.JOptionPane.*;
	public static void skrivUt(int[][] matrise) {
	
		public static void main(String[] args) {
		 int[][] matrise = { {1,2,3}, {4,5,6}, {7,8,9} };
 


		  String utTxt = "Matrise:" + "\n" + skriv(matrise) + "\n";
		    tilStreng(matrise);
		    utTxt += "tilStreng matrise:" + "\n" + skriv(matrise);
		    showMessageDialog(null, utTxt);
		  }

		  public static void tilStreng(int[][] matrise) {
		    for (int i=0; i<3; i++) {
		        System.out.println("n/" + i + " = " );
		      }
		  }

		  public static String skriv(int[][] tab) {
		    String txt = "";
		    for (int i=0; i < tab.length; i++) {
		      for (int j=0; j < tab.length; j++)
		    	   txt += tab[i][j] + "  ";
		    	  txt += "\n";
		    }
		    return txt;
		  }

		}
	
		// TODO
		throw new UnsupportedOperationException("skrivUt ikke implementert");
	}
}
	// b)
	public static String tilStreng(int[][] matrise) {
		
		public static String tilStreng(int[][] matrise) {

		String ut = "";
        String mellomrom = "";

        int [][] matrisTxt = matrise;

        for (int i = 0; i < matrisTxt.length; i++) {
            for (int j = 0; j < matrisTxt.length; j++) {

            mellomrom = Integer.toString(matrisTxt[i][j]);
            
            ut = ut + mellomrom + " ";
            }
            ut = ut + "\n";
        }
        return ut;
		}
	}
		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		public static int[][] skaler(int tall, int[][] matrise) {
	
		
		
			int [][] matrise2;
			matrise2 = new int[matrise.length][];
			for (int i = 0 ; i < matrise.length; i++) {
				matrise2 = new int[matrise.length][matrise[i].length];
			
			}
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise.length; j++) {
				matrise2[i][j] = matrise[i][j] * tall;
			}
		}
	return matrise2;
		}
	}
	

		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
