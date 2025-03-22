import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int PreguntasRealizadas, PreguntasContestadasCorrectamente;
        System.out.println("ingrese el total de preguntas realizadas");
        PreguntasRealizadas=input.nextInt();
        System.out.println("ingrese el tototal de preguntas contestadas correctamente");
        PreguntasContestadasCorrectamente=input.nextInt();
        int porcentaje=(PreguntasContestadasCorrectamente*100)/PreguntasRealizadas;
        if (porcentaje>=90){
            System.out.println("resultado maximo");
        }else{
            if (porcentaje>=75 && porcentaje<90) {
                System.out.println("Resultado medio");
            }else{
                if (porcentaje>=50 && porcentaje<75) {
                    System.out.println("Resultado regular");
                }else{
                    if (porcentaje<50) {
                        System.out.println("Resultado fuera de nivel");
                    }
                }
            }
        }
        input.close();
    }
}
