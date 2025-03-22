import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("ingrese un valor");
        num=input.nextInt();
        if (num==0){
            System.out.println("valor es cero");
        } else {
            if (num>0){
                System.out.println("el valor ingresado es positivo");
            } else {
                if (num<0) {
                    System.out.println("el numero ingresado es negativo");
                }
            }
        }
        input.close();
    }
}
