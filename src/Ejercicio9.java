import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);   
     int nota1, nota2, nota3;
     System.out.println("Ingrese la primera nota");
     nota1=input.nextInt();
     System.out.println("ingrese la segunda nota");
     nota2=input.nextInt();
     System.out.println("ingrese la tercera nota");
     nota3=input.nextInt();
     int promedio=(nota1+nota2+nota3)/3;
     if (promedio >=7) {
        System.out.println("promocionado");
        }else{
            if (promedio>=4 && promedio<7) {
                System.out.println("Regular");
            }else{
                if (promedio<4) {
                    System.out.println("reprobado");
                }
            }
        }
     input.close();
    }
}
