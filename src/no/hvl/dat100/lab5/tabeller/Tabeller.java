package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	
	
      //OUTPUTS:
	public static void main(String[] args) {
	   
	//a output
          int[] tabell = { 1, 2, 3 };
             
	        skrivUt(tabell);
	        
              System.out.println(" ");
          
      //b output
          int [] t = { 42, 67, 89 };
        	     
        	   System.out.println(tilStreng(t));
	  
      //c output   
          System.out.println(summerF(tabell)); 

          System.out.println(summerUF(tabell)); 

          System.out.println(summerW(tabell)); 
          
      //d output
          int[] ta = { 1, 3, 5, 7, 9 };
          int tall = 1;
          
          System.out.println(finnesTall(ta, tall));
          
      //e output
          int[] tab = { 1, 2, 3, 4, 5, 6 };
          int tall2 = 5;
          
          System.out.println(posisjonTall(tab, tall2));
          
          
      //f output
          int[] tabe = { 2, 4, 6};
         
          System.out.print(reverser(tabe));
          
      //g output
          int[] tabel = { 1, 3, 6, 9};
          System.out.println(erSortert(tabel));
	}
	
	
	
	
	//INPUTS:
	// a)
	public static void skrivUt(int[] tabell) {
		
		for(int i = 0; i < tabell.length; i++) {

			System.out.print(tabell[i]);
		}

	}
	
	
	// b)
		public static String tilStreng(int[] tabell) {
			
                  int i = 0;
			int t = tabell.length - 1;
			
			String st = "[";
			String sl = "]";
			String ko = ",";
			String resultat = "";
			
			for(i = 0; i < tabell.length - 1; i++) {
				
				String tabTxt = Integer.toString(tabell[i]);

				resultat += tabTxt + ko;
		      }
			
			resultat = st + resultat + tabell[t] + sl;
			return resultat;
		}
		
		
	// c) 1
	      
		public static int summerF(int[] tabell) {

		    int f = 0;
		
		    for(int i = 0; i < tabell.length; i++) {
			
			    f += tabell[i];
			
		    }
		    
		    return f;
		   
		}
	
	      
	// c) 2
		
	      public static int summerUF(int[] tabell) {
		    
	          int uf = 0;
		
		    for(int i : tabell) {
			
			    uf += i;
		
		    }
		
		    return uf;
		    
	      }

	      
	 // c) 3
	      
	      public static int summerW(int[] tabell) {

		    int i = 0;
		    int w = 0;
			
		    while(i < tabell.length) {
				
				    w += tabell[i];
				    i++;
		    }
			
		    return w;
		}
		
	      
	  // d)
	      
		public static boolean finnesTall(int[] tabell, int tall) {

	       	boolean verdi = false;
			int i = 0;
				
			while (!verdi && i < tabell.length) {
				
				if (tabell[i] == tall) {
				  
					verdi = true;
				}
				
				else {
				    i++;
		            }
			}
				
			return verdi;
		}
		
	 // e)
		public static int posisjonTall(int[] tabell, int tall) {
				
			for (int i = 0; i < tabell.length; i++) {
				
				if (tabell[i] == tall) {
					
					return i;
				}
				
			}
			
			return -1;
			
		}
		

	// f)
	     public static int[] reverser(int[] tabell) {
			
		      int i = 0;
			int a = 0;
			
			while (i <= ((tabell.length - 1) / 2)) {
			
				a = tabell[i];
				
				tabell[i] = tabell[tabell.length - 1 - i];
				tabell[tabell.length-1-i] = a;
				i++;
			}
			
			return tabell;
	     }
	     
	     
      // g)
		public static boolean erSortert(int[] tabell) {
			
			boolean o = false;
			
			for (int i = 1; i < tabell.length; i++)
				
				if ((tabell[i-1]) < tabell[i]) {
					
					o = true;
					i++;
				}
			
				else {
				o = false;
				break;
				}
			
			return o;
		}

	
}