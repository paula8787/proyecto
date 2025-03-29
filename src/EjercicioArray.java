import java.util.Scanner;

public class EjercicioArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int [5];
        int suma = 0;

        for (int i=0; i < numeros.length; i++) {
            System.out.println("ingrese el numero" +(i + 1)+ ":");
            numeros[i] = scanner.nextInt();
            suma += numeros [i];
        }
        double promedio = (double) suma/numeros.length;
        System.out.println("el promedio de los numeros es:"+ promedio);

        scanner.close();
    }
}
