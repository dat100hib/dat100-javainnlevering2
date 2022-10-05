package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	
	

//	 a)
	public static void skrivUt(int[] tabell) {
		
		for (int i=0;i<tabell.length;i++) {
			System.out.println("Index "+i+" : "+tabell[i]);
		}
		//throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String c="";
		String d=",";
		String f="";
		int i=0;
		while(i<tabell.length) {
			c+=tabell[i]+d;
			i++;}
		
		
		return "["+c+"]";
		// TODOthrow new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {
		int sum=0;
		for (int i=0;i<tabell.length;i++)
			sum+=tabell[i];
		return sum;
	}
	

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i=0;i<tabell.length;i++) {
			if (tall==tabell[i]) {
				return true;}}			
		return false;

		// TODOthrow new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int i=0;
		while (i<tabell.length) {
			if(tabell[i]==tall) {
			return i;
			}
				i++;
		}
		return -1;
		// TODOthrow new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int j=0;
		int [] b=new int[tabell.length];
		for (int i=tabell.length-1;i>=0;i--) {	
	    b[j]=tabell[i];  
	    j++;}		
		return b;

		// TODOthrow new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i=1;i<tabell.length;i++) {
			if(tabell[i]<tabell[i-1])
				return false;}
		return true;

		// TODOthrow new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int [] s=new int [tabell1.length+tabell2.length];
		int c=0;
		for (int i=0;i<tabell1.length;i++) {
		s[c]=tabell1[i];
		c++;		
		}
		for (int j=0;j<tabell2.length;j++) {
			s[c]=tabell2[j];
			c++;
		}
		return s;

		// TODOthrow new UnsupportedOperationException("settSammen ikke implementert");
	}
}
