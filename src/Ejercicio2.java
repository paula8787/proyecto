import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int nota1, nota2, nota3;
        System.out.println("Ingrese la primera nota:");
        nota1=input.nextInt();
        System.out.println("Ingrese la segunda nota:");
        nota2=input.nextInt();
        System.out.println("Ingrese la tercera nota");
        nota3=input.nextInt();
        int promedio;
        promedio=(nota1 + nota2 + nota3) / 3;

        if (promedio>=7) {
            System.out.println("promocionado");
        }
        input.close();
    }
}
