import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero");
        num=input.nextInt();
        if (num>0 && num <10) {
            System.out.println("el numero ingresado es de una cifra");
        }else{
            if (num>=10 && num <100) {
                System.out.println("El numero ingresado es de dos cifas");
            }else{
                if (num>=100 && num<1000) {
                    System.out.println("el numero ingresado es de tres cifras");
                }else{
                    if (num>1000) {
                        System.out.println("error");
                    }
                }
            }
        }
        input.close();
    }
}
