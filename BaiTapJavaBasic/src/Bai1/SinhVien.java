package Bai1;

public class SinhVien {
    String tuoi ="23"; //Biến instance
    static String lop ="12/1"; //Biến static
    public void hs(){
        String name = "Hân Lê"; //Biến local
        System.out.println("Tên học sinh: "+ name);
        System.out.println("Tuổi: "+ tuoi);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.hs();
        System.out.println("Lớp: "+lop);
        ThongTin.setTruong();
        ThongTin.setDiaChi(ThongTin.phuong,ThongTin.quan);
    }
}
