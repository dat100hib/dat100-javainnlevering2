package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	// a)
	public static void skrivUt(int[][] matrise) {
		for (int i=0;i<matrise.length;i++) {
			for (int j=0;j<matrise[0].length;j++)
				System.out.println("Index "+i+"-"+j+" : "+matrise[i][j]);
		}
		// TODOthrow new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String b="";
		String c="";
		String d="";
		String e="";
		String s="";
		String g="";
		
			for(int j=0;j<matrise[0].length-1;j++) {
				b+=matrise[0][j]+",";}
			e+=matrise[0][matrise.length-1];
			for (int i=0;i<matrise[1].length-1;i++) {
				c+=matrise[1][i]+",";}
			s+=matrise[1][matrise.length-1];
			for (int f=0;f<matrise[2].length-1;f++) {
				d+=matrise[2][f]+",";}
			g+=matrise[2][matrise.length-1];
		
		return "{"+"{"+b+e+"}"+"\n{"+c+s+"}"+"\n{"+d+g+"}"+"}";

		// TODOthrow new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		for (int i=0;i<matrise.length;i++) {
			for (int j=0;j<matrise[0].length;j++) {
				matrise[i][j]*=tall;}}
				
				return matrise;
		// TODOthrow new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]!=b[i][j])
		return false;}}
		return true;

		// TODOthrow new UnsupportedOperationException("erLik ikke implementert");
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
