package no.hvl.dat100.matriser;

public class Matriser {

    // a) Skriver ut matrisen med to utvidede for-løkker
    public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {
            for (int tall : rad) {
                System.out.print(tall + " ");
            }
            System.out.println();
        }
    }

    // b) Lager tekst med mellomrom etter hvert tall og linjeskift etter hver rad
    public static String tilStreng(int[][] matrise) {
        String tekst = "";

        for (int[] rad : matrise) {
            for (int tall : rad) {
                tekst += tall + " ";
            }
            tekst += "\n";
        }

        return tekst;
    }

    // c) Lager en ny matrise der hvert element multipliseres med tall
    public static int[][] skaler(int tall, int[][] matrise) {
        int[][] resultat = new int[matrise.length][];

        for (int i = 0; i < matrise.length; i++) {
            resultat[i] = new int[matrise[i].length];

            for (int j = 0; j < matrise[i].length; j++) {
                resultat[i][j] = tall * matrise[i][j];
            }
        }

        return resultat;
    }

    // d) Sjekker om matrisene har samme form og samme innhold
    public static boolean erLik(int[][] a, int[][] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false;
            }

            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    // e) Speiler en kvadratisk matrise om hoveddiagonalen
    public static int[][] speile(int[][] matrise) {
        int n = matrise.length;
        int[][] resultat = new int[n][n];

        // Kopierer først hele matrisen
        for (int i = 0; i < n; i++) {
            if (matrise[i].length != n) {
                throw new IllegalArgumentException(
                    "Matrisen må være kvadratisk"
                );
            }

            for (int j = 0; j < n; j++) {
                resultat[i][j] = matrise[i][j];
            }
        }

        // Bytter elementene på hver side av hoveddiagonalen
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int midlertidig = resultat[i][j];
                resultat[i][j] = resultat[j][i];
                resultat[j][i] = midlertidig;
            }
        }

        return resultat;
    }

    // f) Multipliserer to rektangulære matriser
    public static int[][] multipliser(int[][] a, int[][] b) {
        if (a.length == 0 || b.length == 0) {
            throw new IllegalArgumentException(
                "Matrisene må ha minst én rad"
            );
        }

        int raderA = a.length;
        int kolonnerA = a[0].length;
        int raderB = b.length;
        int kolonnerB = b[0].length;

        if (kolonnerA != raderB) {
            throw new IllegalArgumentException(
                "Antall kolonner i a må være lik antall rader i b"
            );
        }

        for (int[] rad : a) {
            if (rad.length != kolonnerA) {
                throw new IllegalArgumentException(
                    "Alle radene i a må ha samme lengde"
                );
            }
        }

        for (int[] rad : b) {
            if (rad.length != kolonnerB) {
                throw new IllegalArgumentException(
                    "Alle radene i b må ha samme lengde"
                );
            }
        }

        int[][] resultat = new int[raderA][kolonnerB];

        for (int i = 0; i < raderA; i++) {
            for (int j = 0; j < kolonnerB; j++) {
                for (int k = 0; k < kolonnerA; k++) {
                    resultat[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return resultat;
    }
}