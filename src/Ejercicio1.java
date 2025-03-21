import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("ingrese el primer numero:");
        double num1 = Scanner.nextDouble();

        System.out.print("ingrese el segundo numero");
        double num2 = Scanner.nextDouble();

        if (num1 > num2) {
            double suma = num1 + num2;
            double diferencia = num1 - num2;
            System.out.print("El primer numro es mayor");
            System.out.print("suma:" + suma);
            System.out.print("diferencia:" + diferencia);

        } else {
            double producto = num1 * num2;
            if (num2 != 0) {
                double division = num1 / num2;
                System.out.print("el primer numero no es mayor");
                System.out.print("producto:" + producto);
                System.out.print("division:" + division);
            } else {
                System.out.print("el segundo numero es cero, la division no es posible");
                System.out.print("producto:" + producto);
            }
        }
        Scanner.close();
    }
}