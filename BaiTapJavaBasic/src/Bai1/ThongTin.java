package Bai1;

public class ThongTin {
    public static String truong ="THPT Tân Bình";
    public static  String quan ="Quận Tân Bình";
    public static String phuong ="Phường 10";

    public static void setDiaChi(String text, String text2){
        System.out.println("Địa chỉ: "+text+","+text2);
    }
    public static void setTruong(){
        System.out.println("Trường: " + truong);
    }
    public static void main(String[] args) {
        setTruong();
        setDiaChi(quan,phuong);

    }
}
