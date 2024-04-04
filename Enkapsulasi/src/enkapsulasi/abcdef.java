package enkapsulasi;

import java.util.Scanner;

public class abcdef {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//        System.out.print("Masukkan a : ");
//        double a = input.nextDouble();
//        System.out.print("Masukkan b : ");
//        double b = input.nextDouble();
//        System.out.print("Masukkan c : ");
//        double c = input.nextDouble();
//        System.out.print("Masukkan d : ");
//        double d = input.nextDouble();
//        System.out.print("Masukkan e : ");
//        double e = input.nextDouble();
//        System.out.print("Masukkan  f: ");
//        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(1, 2, 3, 4, 5, 6);
        
        double nilaiA = equation.getA();
        System.out.println("Nilai a adalah: " + nilaiA);
        
        double nilaiB = equation.getB();
        System.out.println("Nilai b adalah: " + nilaiB);
        
        double nilaiC = equation.getC();
        System.out.println("Nilai c adalah: " + nilaiC);
        
        double nilaiD = equation.getD();
        System.out.println("Nilai d adalah: " + nilaiD);
        
        double nilaiE = equation.getE();
        System.out.println("Nilai e adalah: " + nilaiE);
        
        double nilaiF = equation.getF();
        System.out.println("Nilai a adalah: " + nilaiF);
        
        if (equation.isSolvable()) {
            System.out.println("x adalah " + equation.getX() + " dan y adalah " + equation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }
        input.close();
    }
}
