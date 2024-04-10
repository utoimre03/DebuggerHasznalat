package main;

public class DebuggerHasznalat {

    static final int EGY = 1;
    static int[] tomb = new int[5];;
    
    public static void main(String[] args) {
        peldak();
    }

    private static void peldak() {
        negativGyok();
        intervallum();
        nullTomb();
        int szorzat = nullTomb() * tomb[3];
    }

    private static void negativGyok() {
        int ertek = -25;
        double gyok = Math.sqrt(ertek);
        String s = ertek + " gyöke: " + gyok;
        //kiir(s);
    }

    private static void intervallum() {
        int m = Integer.MAX_VALUE;
        int kapott = m + EGY;
        int hibasVart1 = Integer.MAX_VALUE + 1;
        long hibasVart2 = Integer.MAX_VALUE + 1;
        long joVart = Integer.MAX_VALUE + 1L;
    }

    private static int nullTomb() {
        int[] tomb = new int[]{EGY, 3, 5};
        return tomb[2];
    }

    /* ennek nem is érdekes a működése, de meghívása esetén DOBJA az UnsupportedOperationException KIVÉTELT */
    private static void kiir(String uzenet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
