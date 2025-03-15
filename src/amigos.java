import java.util.Scanner;

public class amigos {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("ingresa el numero del inicio"); ;
    int inicio = input.nextInt();
    System.out.println("ingrese el num fin" );
    int fin = input.nextInt( );
    if (inicio>fin){
        System.out.println("entrada no valida");
        input.close();
        return;
    }
    boolean encontrado = false ;
    System.out.println(Math.max(2, inicio));
    for (int i=Math.max (2,inicio) ; i<fin ; i++) {
        int contadorDivisores = 0; 
        int primerDivisor = 0; 
        int segundoDivisor = 0; 
        for (int j=2; j<=i ; j++) {
            if (i%j == 0){
                contadorDivisores ++ ;
                if (contadorDivisores == 1){
                    primerDivisor = j ;
                } else if (contadorDivisores == 2) {
                    segundoDivisor = j ;
                } else {
                    break;
                }
            }
        }
        if (contadorDivisores == 2){
            encontrado =true;
            System.out.println (i+ "numero amigo"+ primerDivisor + segundoDivisor);
        }
    }
    if (!encontrado){
        System.out.println("no se encontraron numeros amigos");
    }
    input.close();
    }    
}
