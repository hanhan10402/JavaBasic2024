package Bai3;

public class IFESLE2 {
    int number = 100;
    public void setNumber(){
        int n = 100;
        if (n==number){
            System.out.println("bằng nhau");
        } else if (n>number) {
            System.out.println("lớn hơn");
        } else {
            System.out.println("nhỏ hơn");
        }
    }

    public static void main(String[] args) {
        IFESLE2 dieuKien = new IFESLE2();
        dieuKien.setNumber();
    }
}
