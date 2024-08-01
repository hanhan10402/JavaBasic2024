package Bai3;

public class IFESLE {
    static int number = 100;
    public int getnumber (int n){
        return n;
    }

    public static void main(String[] args) {
        IFESLE dieuKien = new IFESLE();
        int son =dieuKien.getnumber(99);
        if (son==number){
            System.out.println("bằng nhau");
        } else {
            if (son<number){
                System.out.println("nhỏ hơn");
            } else System.out.println("lớn hơn");
        }
    }
}
