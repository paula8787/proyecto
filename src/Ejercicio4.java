import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sueldo;
        System.out.println("ingrese su sueldo:");
        sueldo=input.nextInt();
        if (sueldo>3000){
            System.out.println("usted debe abandonar los imouestos");
          }else{
            if (sueldo<3000) {
                System.out.println("tiene un cobro de impuestos");
            }
          }
          input.close();
        } 
    }

