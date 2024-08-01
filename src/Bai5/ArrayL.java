package Bai5;
import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
public class ArrayL {
    public static ArrayList<String> thongTinNV(){
        ArrayList<String> listThongTin1 = new ArrayList<String>();
        listThongTin1.add("Hân Lê");
        listThongTin1.add("10/04/2001");
        listThongTin1.add("Đồng Nai");
//        showThongTin(listThongTin);
        return listThongTin1;
    }
//    public static void thongTin(ArrayList<String> listNV1){
//        listNV1.add("Tài Nè");
//        listNV1.add("17/04/2001");
//        listNV1.add("Gia Lai");
//    }
//
//    public void thongTin2(ArrayList<String> listNV3){
//        listNV3.add("Kua Kua");
//        listNV3.add("123");
//        listNV3.add("TPHCM");
//    }

//    public static void showThongTin(ArrayList<String> listThongTin){
//        for (String obj:listThongTin){
//            System.out.println(" - "+obj+".");
//        }
//        for (int i =0; i< listThongTin.size();i++){
//            System.out.println(" - "+listThongTin.get(i));
//        }
//    }
    public static void main(String[] args) {
        ArrayList<String> listThongTin2 = thongTinNV(); 
        for (String obj:listThongTin2){
            System.out.println("- "+obj+".");
        }

//        ArrayList<String> listNV2 = new ArrayList<String>();
//        thongTin(listNV2);
//        for (String obj:listNV2){
//            System.out.println("- "+obj+".");
//        }
//        ArrayList<String> listNV3 = new ArrayList<String>();
//        ArrayL arr = new ArrayL();
//        arr.thongTin2(listNV3);
//        for (String obj:listNV3){
//            System.out.println("- "+obj+".");
//        }
    }
}
