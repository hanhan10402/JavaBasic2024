package Bai2;

public class Calculator {

    public int sum(int a, int b){
        return a+b;
    }

    public double product(double a, double b){
        return a*b;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(10,10));
        System.out.println(calculator.product(8.5,4.5));

    }
}
