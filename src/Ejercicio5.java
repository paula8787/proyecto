import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1, num2;
        //los numeros deben ser distintos
        System.out.println("ingrese el primer numero");
        num1 = input.nextInt();
        System.out.println("ingrese le segundo numero");
        num2=input.nextInt();
        if (num1>num2){
            System.out.println("el numero mayor es:" + num1);
        } else {
            if (num2>num1){
                System.out.println("el numero mayor es:" + num2);
            }
        }
        input.close();
    }
}
