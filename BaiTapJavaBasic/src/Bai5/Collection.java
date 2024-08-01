package Bai5;

import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        for (int i = 0; i <=50; i++){
           if (i%2==0){
               arrL.add(i);
           }
        }
//        for (int g : arrL){
//            System.out.print(g + " ");
//        }
        for (int j = 0; j<arrL.size(); j++){
            System.out.print(arrL.get(j) + " ");
        }
    }
}
