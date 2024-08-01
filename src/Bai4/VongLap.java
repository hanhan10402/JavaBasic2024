package Bai4;

public class VongLap {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int arr[] = new int[count];
        int index = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                arr[index] = i;
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//        int cout = 26;
//        int arl[] = new int[count];
//        int index = 0;
//        for (int j = 0; j <= 50; j+=2) {
//            arl[index] = j;
//            index ++;
//        }
//        for (int j = 0; j < arl.length; j++) {
//            System.out.print(arl[j] + " ");
//        }
    }
}
