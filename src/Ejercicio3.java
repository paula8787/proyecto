import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("ingrese un valor entro de 1 o 2 digitos");
        num=input.nextInt();
        if (num<10){
            System.out.println("El numero es de un digito");
        } else {
            if (num>=10 && num<100) {
                System.out.println("el numero es de dos digitos");
            }
        }
        input.close();
    }
}
