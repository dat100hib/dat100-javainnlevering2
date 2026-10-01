package no.hvl.dat100.tabeller;  


public class Tabeller {
    public static void skrivUt(int[] tabell) {
        System.out.println(tilStreng(tabell));

    }

public static String tilStreng(int[] tabell) {
    String tekst = "[";
    for (int i = 0; i < tabell.length; i++) {
        if (i > 0) {
            tekst += ",";
        }
        tekst += tabell[i];
    }
    return tekst + "]";
}

public static int summer(int[] tabell) {
    int sum = 0;
    for (int tall : tabell) {
        sum += tall;
    }
    return sum;
}
public static boolean finnesTall(int[] tabell, int tall) {
    for (int element : tabell) {
        if (element == tall) {
            return true;
        }
    }
    return false;
}

public static int posisjonTall(int[] tabell, int tall) {
    for (int i = 0; i < tabell.length; i++) {
        if (tabell[i] == tall) {
            return i;
        }
    }
    return -1;


}
public static int[] reverser(int[] tabell) {
    int[] reversert = new int[tabell.length];
    for (int i = 0; i < tabell.length; i++) {
        reversert[i] = tabell[tabell.length - 1 - i];
    }
    return reversert;
}
public static boolean erSortert(int[] tabell) {
    for (int i = 0; i < tabell.length - 1; i++) {
        if (tabell[i] > tabell[i + 1]) {
            return false;
        }
    }
    return true;
}
public static int[] settSammen(int[] tabell1, int[] tabell2) {
    int[] sammensatt = new int[tabell1.length + tabell2.length];
    for (int i = 0; i < tabell1.length; i++) {
        sammensatt[i] = tabell1[i];
    }
    for (int i = 0; i < tabell2.length; i++) {
        sammensatt[tabell1.length + i] = tabell2[i];
    }
    return sammensatt;
}

}