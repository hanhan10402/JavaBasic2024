package Bai3;

public class ToanTu {
   public int a=10;
    public int b=5;
    public int c=-5;

    public boolean aLonHonb() {
        return a > b;
    }

    public boolean aNhoHonb() {
        return a < b;
    }

    public boolean aBangb() {
        return a == b;
    }

    public boolean toanTuVa() {
        return (a > b) && (b > c);
    }

    public boolean toanTuHoac() {
        return (a > b) || (b > c);
    }

    public static void main(String[] args) {
        ToanTu toanTu = new ToanTu();
        System.out.println("a > b: " + toanTu.aLonHonb());
        System.out.println("a < b: " + toanTu.aNhoHonb());
        System.out.println("a == b: " + toanTu.aBangb());
        System.out.println("(a > b) && (b > c): " + toanTu.toanTuVa());
        System.out.println("(a > b) || (b > c): " + toanTu.toanTuHoac());
    }
}

