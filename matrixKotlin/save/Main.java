package com.homework.matrix;

public class Main {
    public static void main(String[] args) {

        Matrix x = new Matrix(2,2);
        Matrix y = new Matrix(2,3);
        generateUsualMatrix(x);
        generateUsualMatrix(y);
        System.out.println("First matrix(x)");
        System.out.println(x);
        System.out.println("Second matrix(y)");
        System.out.println(y);
        System.out.println("Transpose matrix (x)");
        System.out.println(x.tranponir());
        System.out.println("x + x");
        System.out.println(x.plus(x));
        System.out.println("x * y");
        System.out.println(x.multip(y));

        System.out.println("With imaginary number");

        generateComplexMatrix(x);
        generateComplexMatrix(y);
        System.out.println("First matrix(x)");
        System.out.println(x);
        System.out.println("Second matrix(y)");
        System.out.println(y);
        System.out.println("Transpose matrix (x)");
        System.out.println(x.tranponir());
        System.out.println("y + y");
        System.out.println(y.plus(y));
        System.out.println("x * y");
        System.out.println(x.multip(y));
    }

    private static void generateUsualMatrix(Matrix x) {
        for(int i = 0; i < x.getN(); i++){
            for(int j = 0; j < x.getM(); j++){
                x.setValue(new ComplexNumber(1 + (int) (Math.random() * 10), 0), i, j);
            }
        }
    }

    private static void generateComplexMatrix(Matrix x){
        for(int i = 0;i < x.getN();i++){
            for(int j = 0;j < x.getM();j++){
                x.setValue(new ComplexNumber(1 + (int) (Math.random() * 10), 1 + (int) (Math.random() * 10)), i, j);
            }
        }
    }
}